package com.radualmasan.codility.cdk;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WordFinderTest {

    private WordFinder wordFinder = new WordFinder();

    @Test
    public void testGivenExample() throws Exception {
        assertTrue(wordFinder.exists(new String[] {"ABCKR", "SFCSI", "ADAHS"}, "KRISH"));
    }
}
