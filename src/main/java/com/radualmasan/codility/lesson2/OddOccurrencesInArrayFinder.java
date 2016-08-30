package com.radualmasan.codility.lesson2;

import java.util.Arrays;

public class OddOccurrencesInArrayFinder {

    public int find(int[] ints) {
        if (ints.length == 1)
            return ints[0];

        Arrays.parallelSort(ints);

        for (int i = 0; i < ints.length - 1; i += 2)
            if (ints[i] != ints[i + 1])
                return ints[i];

        return ints[ints.length - 1];
    }
}
