package com.radualmasan.codility.snp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JacobAndJaydenTest {

    private JacobAndJayden jacobAndJayden = new JacobAndJayden();

    @Test
    public void testGivenInput() throws Exception {
        assertEquals(4, jacobAndJayden.solution(7, 42, new int[]{6, 42, 11, 7, 1, 42}));
    }

    @Test
    public void testSameXAndY() throws Exception {
        assertEquals(5, jacobAndJayden.solution(7, 7, new int[]{6, 42, 11, 7, 1, 42}));
    }

    @Test
    public void testEmptyLength1Array() throws Exception {
        assertEquals(-1, jacobAndJayden.solution(7, 42, new int[]{1}));
    }
}
