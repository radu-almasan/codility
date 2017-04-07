package com.radualmasan.codility.lesson4countingelements;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogRiverOneTest {

    @Test
    public void testGivenInput() throws Exception {
        assertEquals(6, new FrogRiverOne(new int[]{1, 3, 1, 4, 2, 3, 5, 4}, 5).find());
    }

    @Test
    public void testSmallNoPath() throws Exception {
        assertEquals(-1, new FrogRiverOne(new int[]{1, 3, 1, 4, 2, 3, 5, 4}, 6).find());
    }

    @Test
    public void testSmallestSized() throws Exception {
        assertEquals(0, new FrogRiverOne(new int[]{1}, 1).find());
    }

    @Test
    public void testEmptyArray() throws Exception {
        assertEquals(-1, new FrogRiverOne(new int[0], 1).find());
    }

    @Test
    public void testNoNeedToMove() throws Exception {
        assertEquals(0, new FrogRiverOne(new int[]{1, 2, 3}, 0).find());
    }
}
