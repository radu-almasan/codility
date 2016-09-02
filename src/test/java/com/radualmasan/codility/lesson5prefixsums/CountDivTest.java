package com.radualmasan.codility.lesson5prefixsums;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountDivTest {

    private CountDiv countDiv = new CountDiv();

    @Test
    public void testGivenInput() throws Exception {
        assertEquals(3, countDiv.count(6, 11, 2));
    }

    @Test
    public void testZeroInterval() throws Exception {
        assertEquals(1, countDiv.count(0, 0, 7));
        assertEquals(0, countDiv.count(10, 10, 7));
    }

    @Test
    public void testSmallestDivisor() throws Exception {
        assertEquals(11, countDiv.count(0, 10, 1));
    }

    @Test
    public void testWithLargestInterval() throws Exception {
        assertEquals(1_000_000_001, countDiv.count(0, 2_000_000_000, 2));
    }

    @Test
    public void testSimple() throws Exception {
        assertEquals(20, countDiv.count(11, 345, 17));
    }

    @Test
    public void testMaxInt() throws Exception {
        assertEquals(Integer.MAX_VALUE, countDiv.count(1, Integer.MAX_VALUE, 1));
    }

    @Test
    public void testMaxIntHIghestStep() throws Exception {
        assertEquals(1, countDiv.count(1, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void testSmallestIntervalWithDiv1() throws Exception {
        assertEquals(2, countDiv.count(0, 1, 1));
    }

    @Test
    public void testBothEndsDividable() throws Exception {
        assertEquals(5, countDiv.count(2, 10, 2));
    }
}
