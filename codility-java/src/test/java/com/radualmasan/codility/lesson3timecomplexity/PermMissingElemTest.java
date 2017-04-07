package com.radualmasan.codility.lesson3timecomplexity;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class PermMissingElemTest {

    private PermMissingElem permMissingElem = new PermMissingElem();

    @Test
    public void testGivenInput() throws Exception {
        assertEquals(4, permMissingElem.find(new int[]{2, 3, 1, 5}));
    }

    @Test
    public void testSingleElementArray() throws Exception {
        assertEquals(1, permMissingElem.find(new int[]{2}));
        assertEquals(2, permMissingElem.find(new int[]{1}));
    }

    @Test
    public void testFirstMissing() throws Exception {
        assertEquals(1, permMissingElem.find(new int[]{2, 3, 4, 5, 6, 7, 8, 9}));
    }

    @Test
    public void testLastMissing() throws Exception {
        assertEquals(9, permMissingElem.find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }

    @Test
    public void testWithLongArray() throws Exception {
        int million = 1000000;
        int[] ints = IntStream.range(1, million).toArray();
        assertEquals(million, permMissingElem.find(ints));
    }

    @Test
    public void testEmpty() throws Exception {
        assertEquals(1, permMissingElem.find(new int[]{}));
    }

    @Test
    public void testTwoElements() throws Exception {
        assertEquals(2, permMissingElem.find(new int[]{1, 3}));
    }
}
