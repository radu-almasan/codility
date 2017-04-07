package com.radualmasan.codility.lesson4countingelements;

import java.util.Arrays;

public class FrogRiverOne {

    private static final int NOT_SET = Integer.MAX_VALUE;

    private final int[] locationsWhereLeavesFall;
    private final int destination;
    private final int[] minSecondsByLocation;

    private int locationsFound = 0;

    private Integer result;

    public FrogRiverOne(int[] locationWhereLeavesFall, int destination) {
        this.locationsWhereLeavesFall = locationWhereLeavesFall;
        this.destination = destination;

        minSecondsByLocation = new int[destination];
        Arrays.fill(minSecondsByLocation, Integer.MAX_VALUE);
    }

    public int find() {
        if (result == null)
            computeResult();

        return result;
    }

    private void computeResult() {
        if (destination == 0) {
            result = 0;
            return;
        }

        for (int second = 0; second < locationsWhereLeavesFall.length; second++) {
            int location = locationsWhereLeavesFall[second];
            int minSecondForLocation = minSecondsByLocation[location - 1];
            if (isNewLocation(minSecondForLocation))
                locationsFound++;

            if (second < minSecondForLocation)
                minSecondsByLocation[location - 1] = second;

            if (locationsFound == destination) {
                result = computeMaxSecondsRequiredToWait();
                return;
            }
        }

        result = -1;
    }

    private Integer computeMaxSecondsRequiredToWait() {
        int max = -1;
        for (int i : minSecondsByLocation)
            max = i > max ? i : max;

        return max;
    }

    private boolean isNewLocation(int minSecondForLocation) {
        return minSecondForLocation == NOT_SET;
    }
}
