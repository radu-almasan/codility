package com.radualmasan.codility.lesson4countingelements;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PermCheckTest {

    private PermCheck permCheck = new PermCheck();

    @Test
    public void testGivenInput() throws Exception {
        assertTrue(permCheck.isPerm(new int[]{4, 1, 3, 2}));
    }

    @Test
    public void testSingleElement() throws Exception {
        assertTrue(permCheck.isPerm(new int[]{1}));
    }

    @Test
    public void testSingleElementNotValid() throws Exception {
        assertFalse(permCheck.isPerm(new int[]{2}));
    }

    @Test
    public void testGivenInputNotAPerm() throws Exception {
        assertFalse(permCheck.isPerm(new int[]{4, 1, 3}));
    }
}
