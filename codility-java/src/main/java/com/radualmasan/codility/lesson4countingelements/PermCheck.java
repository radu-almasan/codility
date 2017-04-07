package com.radualmasan.codility.lesson4countingelements;

import java.util.Arrays;

public class PermCheck {

    public boolean isPerm(int[] ints) {
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            if (i+1 != ints[i])
                return false;
        }

        return true;
    }
}
