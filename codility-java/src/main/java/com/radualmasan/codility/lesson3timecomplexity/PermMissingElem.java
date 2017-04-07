package com.radualmasan.codility.lesson3timecomplexity;

import java.util.Arrays;

public class PermMissingElem {

    public int find(int[] ints) {
        if (ints.length == 0)
            return 1;
        else if (ints.length == 1)
            return ints[0] == 1 ? 2 : 1;

        Arrays.sort(ints);

        int n = ints.length + 1;
        for (int i = 1; i <= n / 2; i++)
            if (ints[i - 1] != i)
                return i;

            else if (ints[ints.length - i] != n - i + 1)
                return n - i + 1;

        return n / 2 + 1;
    }
}
