package com.radualmasan.codility.xtra.athlantean;

import static java.lang.Character.isWhitespace;

public interface ExplicativeDictionary {

    default boolean isPause(char word) {
        return isWhitespace(word);
    }

    boolean isAction(char word);

    boolean isState(char word);
}
