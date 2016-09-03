package com.radualmasan.codility.snp;

import java.math.BigInteger;
import java.util.Arrays;

public class Equilibrium {

    public int find(int[] ints) {
        if (ints.length > 0) {
            BigInteger leftSum = BigInteger.ZERO;
            BigInteger rightSum = getInitialRightSum(ints);

            int p = 0;
            do
                if (leftSum.equals(rightSum))
                    return p;
                else {
                    leftSum = leftSum.add(BigInteger.valueOf(ints[p]));

                    rightSum = rightSum.subtract(BigInteger.valueOf(p + 1 == ints.length ? 0 : ints[p + 1]));
                    p++;
                }
            while (p < ints.length);
        }

        return -1;
    }

    BigInteger getInitialRightSum(int[] ints) {
        return Arrays.stream(ints, 1, ints.length)
                .mapToObj(String::valueOf).map(BigInteger::new)
                .reduce(BigInteger.ZERO, BigInteger::add);
    }
}
