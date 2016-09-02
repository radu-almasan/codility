package com.radualmasan.codility.lesson5prefixsums;

public class CountDiv {

    public int count(int a, int b, int div) {
        int firstDividableFAfterA = a == 0 ? 0 : a < div ? div : getNextDividableAfterA(a, div);
        int lastDividableBeforeB = b == 0 ? 0 : getLastDividableBeforeB(b, div);

        return isZeroInterval(firstDividableFAfterA, lastDividableBeforeB) ? 0
                : getDividableNumbers(div, firstDividableFAfterA, lastDividableBeforeB);
    }

    private int getNextDividableAfterA(int a, int div) {
        return a + (a + div) % div;
    }

    private int getLastDividableBeforeB(int b, int div) {
        return b - (b % div);
    }

    private boolean isZeroInterval(int firstDividableFAfterA, int lastDividableBeforeB) {
        return firstDividableFAfterA > lastDividableBeforeB;
    }

    private int getDividableNumbers(int div, int firstDividableFAfterA, int lastDividableBeforeB) {
        return (lastDividableBeforeB - firstDividableFAfterA) / div + 1;
    }
}
