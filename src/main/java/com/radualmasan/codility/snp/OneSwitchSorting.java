package com.radualmasan.codility.snp;

import java.util.Arrays;
import java.util.stream.IntStream;

public class OneSwitchSorting {

    public boolean isSortable(int[] ints) {
        int[] sortedInts = Arrays.copyOf(ints, ints.length);
        Arrays.sort(sortedInts);

        long notInCorrectPossition = IntStream.range(0, ints.length)
                .parallel()
                .filter(i -> ints[i] != sortedInts[i])
                .limit(3)
                .count();

        return notInCorrectPossition <= 2;
    }
}
