package com.radualmasan.codility.lesson4countingelements;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MaxCountersTest {

    private MaxCounters maxCounters = new MaxCounters();

    @Test
    public void testGivenInput() throws Exception {
        assertArrayEquals(new int[]{3, 2, 2, 4, 2}, maxCounters.apply(new int[]{3, 4, 4, 6, 1, 4, 4}, 5));
    }

    @Test
    public void testNoCounters() {
        assertArrayEquals(new int[0], maxCounters.apply(new int[]{3, 4, 4, 6, 1, 4, 4}, 0));
    }

    @Test
    public void testJustOneMaxCounterOperation() throws Exception {
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, maxCounters.apply(new int[]{6}, 5));
    }

    @Test
    public void testJustOneIncrementOperation() throws Exception {
        assertArrayEquals(new int[]{1, 0, 0, 0, 0}, maxCounters.apply(new int[]{1}, 5));
    }


    @Test
    public void testOneIncrementAndOneMaxCounterOperation() throws Exception {
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, maxCounters.apply(new int[]{1, 6}, 5));
    }
}
