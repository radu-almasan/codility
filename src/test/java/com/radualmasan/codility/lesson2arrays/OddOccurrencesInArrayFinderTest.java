package com.radualmasan.codility.lesson2arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OddOccurrencesInArrayFinderTest {

    private OddOccurrencesInArrayFinder finder;

    @Before
    public void setUp() {
        finder = new OddOccurrencesInArrayFinder();
    }

    @Test
    public void testSingleElementInArray() throws Exception {
        int element = 5;
        assertEquals(element, finder.find(new int[]{element}));
    }

    @Test
    public void testGivenExample() throws Exception {
        assertEquals(7, finder.find(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }
}
