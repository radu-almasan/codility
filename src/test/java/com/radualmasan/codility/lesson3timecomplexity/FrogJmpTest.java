package com.radualmasan.codility.lesson3timecomplexity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogJmpTest {

    private FrogJmp frogJmp = new FrogJmp();

    @Test
    public void testGivenInput() throws Exception {
        assertEquals(3, frogJmp.computeJumps(10, 85, 30));
    }

    @Test
    public void testLowestJumpSize() throws Exception {
        assertEquals(10, frogJmp.computeJumps(0, 10, 1));
    }

    @Test
    public void testWithSameStartAndFinish() throws Exception {
        assertEquals(0, frogJmp.computeJumps(0, 0, Integer.MAX_VALUE));
    }
}
