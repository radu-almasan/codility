package com.radualmasan.codility.lesson5prefixsums;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinAvgTwoSliceTest {

    private MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();

    @Test
    public void testGivenExample() throws Exception {
        test(new int[]{4, 2, 2, 5, 1, 5, 8}, 1);
    }

    @Test
    public void testSliceOf3() throws Exception {
        test(new int[]{1, 8, 1, 5, 1, 5, 1}, 2);
    }

    @Test
    public void testSimple() throws Exception {
        test(new int[]{1, 0, 1, 0, 1, 0, 0, 1}, 5);
    }

    private void test(int[] elements, int expected) {
        int startingIndex = minAvgTwoSlice.findStartOfMinimalAverageSlice(elements);
        assertEquals(expected, startingIndex);
    }
}
