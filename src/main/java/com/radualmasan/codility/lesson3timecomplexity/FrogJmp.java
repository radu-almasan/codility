package com.radualmasan.codility.lesson3timecomplexity;

public class FrogJmp {

    public int computeJumps(int start, int finish, int jumpSize) {
        int distance = finish - start;
        int jumps = distance / jumpSize;
        return landsExactlyOnFinish(jumpSize, distance) ? jumps : jumps + 1;
    }

    private boolean landsExactlyOnFinish(int jumpSize, int distance) {
        return distance % jumpSize == 0;
    }
}
