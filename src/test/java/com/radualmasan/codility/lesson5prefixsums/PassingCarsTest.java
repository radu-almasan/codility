package com.radualmasan.codility.lesson5prefixsums;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassingCarsTest {

    private PassingCars passingCars = new PassingCars();

    @Test
    public void testGivenInput() throws Exception {
        assertEquals(5, passingCars.find(new int[]{0, 1, 0, 1, 1}));
    }

    @Test
    public void testSingleElementInArray() throws Exception {
        assertEquals(0, passingCars.find(new int[]{0}));
    }

    @Test
    public void testOnePair() throws Exception {
        assertEquals(1, passingCars.find(new int[]{0, 1}));
    }

    @Test
    public void testOnePairReversed() throws Exception {
        assertEquals(0, passingCars.find(new int[]{1, 0}));
    }

    @Test
    public void testSimilarToGivenInputButBigger() throws Exception {
        assertEquals(8, passingCars.find(new int[]{0, 1, 0, 1, 1, 0, 1}));
    }
}
