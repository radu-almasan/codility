package com.radualmasan.codility.lesson4countingelements;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingIntegerTest {

    private MissingInteger missingInteger = new MissingInteger();

    @Test
    public void testGivenInput() throws Exception {
        assertEquals(5, missingInteger.find(new int[]{1, 3, 6, 4, 1, 2}));
    }

    @Test
    public void testSingleElementArrayIs1() throws Exception {
        assertEquals(2, missingInteger.find(new int[]{1}));
    }

    @Test
    public void testSingleElementArrayIs2() throws Exception {
        assertEquals(1, missingInteger.find(new int[]{2}));
    }

    @Test
    public void testWithNegativeElements() throws Exception {
        assertEquals(4, missingInteger.find(new int[]{-2, -5, 1, 2, 3, 5}));
    }
}
