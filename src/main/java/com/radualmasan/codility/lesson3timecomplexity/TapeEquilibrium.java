package com.radualmasan.codility.lesson3timecomplexity;

import java.util.Arrays;

public class TapeEquilibrium {

    public int findLowestSum(final int[] ints) {
        int leftSum = ints[0];
        int rightSum = Arrays.stream(ints, 1, ints.length).sum();
        int minDiff = Math.abs(leftSum - rightSum);

        if (minDiff == 0)
            return 0;

        for (int i = 2; i < ints.length; i++) {
            leftSum += ints[i - 1];
            rightSum -= ints[i - 1];
            int currentDiff = Math.abs(leftSum - rightSum);

            if (currentDiff == 0)
                return 0;

            if (minDiff > currentDiff)
                minDiff = currentDiff;
        }

        return minDiff;
    }
}
