package com.radualmasan.codility.lesson5prefixsums;

public class MinAvgTwoSlice {

    public int findStartOfMinimalAverageSlice(int[] elements) {
        double lowestAverage = Double.MAX_VALUE;
        int sliceLength = -1;
        int endingIndex = -1;

        for (int i = 1; i < elements.length; i++) {
            double average2 = (elements[i] + elements[i - 1]) / 2d;

            if (average2 < lowestAverage) {
                lowestAverage = average2;
                sliceLength = 2;
                endingIndex = i;
            }

            if (i > 1) {
                double average3 = (elements[i] + elements[i - 1] + elements[i - 2]) / 3d;

                if (average3 < lowestAverage) {
                    lowestAverage = average3;
                    sliceLength = 3;
                    endingIndex = i;
                }
            }
        }

        return (endingIndex - sliceLength) + 1;
    }
}
