package com.radualmasan.codility.xtra.athlantean;

import java.util.Stack;

public class PhilosopherToActiveMathTranslator implements DialectTranslator {

    private ExplicativeDictionary explicativeDictionary = new PhilosopherExplicativeDictionary();
    private Dictionary dictionary = new PhilosopherToActiveMathDictionary();

    public String translate(String phrase) {
        Stack<String> states = new Stack<>();
        Stack<String> actions = new Stack<>();

        for (int i = 0; i < phrase.length(); i++) {
            char word = phrase.charAt(i);

            if (explicativeDictionary.isState(word)) {
                if (states.size() > 1)
                    throw new GramaticalException("action not present");

                states.add(Character.toString(dictionary.translate(word)));

            } else if (explicativeDictionary.isAction(word)) {
                if (states.size() != 1)
                    throw new GramaticalException("action found in incorrect place");

                actions.add(Character.toString(dictionary.translate(word)));

            } else if (!explicativeDictionary.isPause(word))
                throw new IllegalArgumentException(String.format("Unknown word '%s'", word));

            if (states.size() > 1) {
                String state2 = states.pop();
                String state1 = states.pop();
                states.add(actions.pop() + state1 + state2);
            }
        }

        String result = states.pop();
        System.out.println(result);
        return result;
    }
}
