package com.radualmasan.codility.lesson3timecomplexity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TapeEquilibriumTest {

    private TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

    @Test
    public void testArrayWithTwoElements() throws Exception {
        assertEquals(1, tapeEquilibrium.findLowestSum(new int[]{1, 2}));
    }

    @Test
    public void testGivenExample() throws Exception {
        assertEquals(1, tapeEquilibrium.findLowestSum(new int[]{3, 1, 2, 4, 3}));
    }

    @Test
    public void testRightmostCase() throws Exception {
        assertEquals(0, tapeEquilibrium.findLowestSum(new int[]{10, 5, 5, 20, 40}));
    }

    @Test
    public void testLeftmostCase() throws Exception {
        assertEquals(1, tapeEquilibrium.findLowestSum(new int[]{41, 10, 5, 5, 20}));
    }

    @Test
    public void testLeftmostIsPerfectBalance() throws Exception {
        assertEquals(0, tapeEquilibrium.findLowestSum(new int[]{40, 10, 5, 5, 20}));
    }
}
