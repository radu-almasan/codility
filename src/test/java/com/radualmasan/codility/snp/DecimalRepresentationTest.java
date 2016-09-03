package com.radualmasan.codility.snp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecimalRepresentationTest {

    private DecimalRepresentation decimalRepresentation = new DecimalRepresentation();

    @Test
    public void test3By1() throws Exception {
        assertResult("3", 3, 1);
    }

    @Test
    public void test4By2() throws Exception {
        assertResult("2", 4, 2);
    }

    @Test
    public void test5By2() throws Exception {
        assertResult("2.5", 5, 2);
    }

    @Test
    public void test3By4() throws Exception {
        assertResult("0.75", 3, 4);
    }

    @Test
    public void test11By10() throws Exception {
        assertResult("1.1", 11, 10);
    }

    @Test(timeout = 100)
    public void test1By3() throws Exception {
        assertResult("0.(3)", 1, 3);
    }

    @Test(timeout = 100)
    public void test3By28() throws Exception {
        assertResult("0.10(714285)", 3, 28);
    }

    private void assertResult(String expected, int dividend, int divisor) {
        assertEquals(expected, decimalRepresentation.get(dividend, divisor));
    }
}
