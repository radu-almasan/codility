package com.radualmasan.codility.snp;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class EquilibriumTest {

    private Equilibrium equilibrium = new Equilibrium();

    @Test
    public void testGivenInput() throws Exception {
        assertEquals(1, equilibrium.find(new int[]{-1, 3, -4, 5, 1, -6, 2, 1}));
    }

    @Test
    public void testGetInitialRightSum() throws Exception {
        assertEquals(BigInteger.valueOf(2), equilibrium.getInitialRightSum(new int[]{1, 2}));
        assertEquals(BigInteger.valueOf(5), equilibrium.getInitialRightSum(new int[]{1, 2, 3}));
        assertEquals(BigInteger.ZERO, equilibrium.getInitialRightSum(new int[]{1}));
    }

    @Test
    public void testEmptyArray() throws Exception {
        assertEquals(-1, equilibrium.find(new int[0]));
    }

    @Test
    public void testLength1Array() throws Exception {
        assertEquals(0, equilibrium.find(new int[]{0}));
    }

    @Test
    public void testRightmostValidCase() throws Exception {
        int[] ints = {-1, 1, 0};
        assertEquals(ints.length - 1, equilibrium.find(ints));
    }

    @Test
    public void testNoBalance() throws Exception {
        int[] ints = {1, 1, -2};
        assertEquals(-1, equilibrium.find(ints));
    }
}
