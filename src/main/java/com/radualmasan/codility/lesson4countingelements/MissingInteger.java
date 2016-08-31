package com.radualmasan.codility.lesson4countingelements;

import java.util.Arrays;

public class MissingInteger {

    public int find(int[] ints) {
        Arrays.sort(ints);

        int min = 0;
        for (int i : ints)
            if (i > 0)
                if (min != i && min + 1 != i)
                    return min + 1;
                else
                    min = i;

        return min + 1;
    }
}
