package com.radualmasan.codility.lesson5prefixsums;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class GenomicRangeQueryTest {

    private GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();

    @Test
    public void testGivenExample() throws Exception {
        int[] solution = genomicRangeQuery.findLowestImpactFactors("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6});
        assertArrayEquals(new int[]{2, 4, 1}, solution);
    }

    @Test
    public void testExtremeDouble1() throws Exception {
        int[] solution = genomicRangeQuery.findLowestImpactFactors("AC", new int[]{0, 0, 1}, new int[]{0, 1, 1});
        assertArrayEquals(new int[]{1, 1, 2}, solution);
    }
}
