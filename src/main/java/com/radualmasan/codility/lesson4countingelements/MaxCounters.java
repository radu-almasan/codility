package com.radualmasan.codility.lesson4countingelements;

public class MaxCounters {

    public int[] apply(int[] ints, int n) {
        int[] counters = new int[n];
        int highestCounterValue = 0;
        int lastResetValue = 0;

        for (int k : ints)
            if (k <= n) {
                int currentValue = counters[k - 1];
                counters[k - 1] = (lastResetValue > currentValue ? lastResetValue : currentValue) + 1;
                highestCounterValue = Math.max(highestCounterValue, counters[k - 1]);

            } else
                lastResetValue = highestCounterValue;

        for (int i = 0; i < counters.length; i++)
            if (counters[i] < lastResetValue)
                counters[i] = lastResetValue;

        return counters;
    }
}
