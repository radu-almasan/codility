package com.radualmasan.codility.xtra.athlantean;

import java.util.HashMap;
import java.util.Map;

public class PhilosopherToActiveMathDictionary implements Dictionary {

    private static Map<Character, Character> CONTENT = new HashMap<>();
    static {
        CONTENT.put('a', '+');
        CONTENT.put('e', '-');
        CONTENT.put('i', '*');
        CONTENT.put('o', '/');
        CONTENT.put('u', '^');

        CONTENT.put('b', '1');
        CONTENT.put('c', '2');
        CONTENT.put('d', '3');
        CONTENT.put('l', '4');
        CONTENT.put('m', '5');
        CONTENT.put('n', '6');
        CONTENT.put('p', '7');
        CONTENT.put('r', '8');
        CONTENT.put('s', '9');
        CONTENT.put('t', '0');
    }

    @Override
    public char translate(char word) {
        Character translation = CONTENT.get(word);
        if (translation == null)
            throw new IllegalArgumentException(String.format("unknown word '%s'", word));

        return translation;
    }
}
