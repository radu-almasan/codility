package com.radualmasan.codility.xtra.athlantean;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;

public class PhilosopherExplicativeDictionary implements ExplicativeDictionary {

    private static final char[] ACTIONS = {'a', 'e', 'i', 'o', 'u'};
    private static final char[] STATES = {'b', 'c', 'd', 'l', 'm', 'n', 'p', 'r', 's', 't'};

    static {
        sort(ACTIONS);
        sort(STATES);
    }

    @Override
    public boolean isAction(char word) {
        return binarySearch(ACTIONS, word) >= 0;
    }

    @Override
    public boolean isState(char word) {
        return binarySearch(STATES, word) >= 0;
    }
}
