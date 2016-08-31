package com.radualmasan.codility.lesson5prefixsums;

public class PassingCars {

    private static final int THRESHOLD = 1_000_000_000;

    public int find(int[] ints) {
        int result = 0;

        int passingWestSoFar = 0;
        for (int i = ints.length - 1; i >= 0; i--) {
            if (ints[i] == 0)
                result += passingWestSoFar;
            else
                passingWestSoFar++;

            if (result > THRESHOLD)
                return -1;
        }

        return result;
    }
}
