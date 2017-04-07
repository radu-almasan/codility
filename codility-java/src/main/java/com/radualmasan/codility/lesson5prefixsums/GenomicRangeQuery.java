package com.radualmasan.codility.lesson5prefixsums;

import java.util.stream.IntStream;

import static java.lang.System.arraycopy;

public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {
        return findLowestImpactFactors(S, P, Q);
    }

    public int[] findLowestImpactFactors(String sequence, int[] froms, int[] tos) {
        int[][] sums = computePrefixSums(sequence);
        return getImpactFactorsForRanges(froms, tos, sums);
    }

    private int[][] computePrefixSums(String sequence) {
        int[][] sums = new int[sequence.length()][4];

        for (int i = 0; i < sequence.length(); i++) {
            if (i > 0)
                arraycopy(sums[i - 1], 0, sums[i], 0, 4);

            int impactFactor = getImpactFactorForNucleotide(sequence.charAt(i));
            sums[i][impactFactor - 1]++;
        }

        return sums;
    }

    private int[] getImpactFactorsForRanges(int[] froms, int[] tos, int[][] sums) {
        return IntStream.range(0, froms.length)
                .map(i -> getImpactFactorForRange(froms[i], tos[i], sums))
                .toArray();
    }


    private Integer getImpactFactorForRange(int from, int to, int[][] sums) {
        for (int i = 0; i < 4; i++) {
            int count = sums[to][i] - (from == 0 ? 0 : sums[from - 1][i]);

            if (count > 0)
                return i + 1;
        }

        throw new IllegalStateException();
    }

    private int getImpactFactorForNucleotide(char c) {
        switch (c) {
            case 'A':
                return 1;
            case 'C':
                return 2;
            case 'G':
                return 3;
            case 'T':
                return 4;
            default:
                throw new IllegalArgumentException();
        }
    }
}
