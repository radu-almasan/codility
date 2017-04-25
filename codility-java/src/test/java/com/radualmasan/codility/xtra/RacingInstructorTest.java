package com.radualmasan.codility.xtra;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RacingInstructorTest {

    private RacingInstructor racingInstructor = new RacingInstructor();

    @Test
    public void testSimpleTrackIncreaseAndMaintain() throws Exception {
        assertThat(racingInstructor.getInstructions(new int[]{4, 4, 2}),
                is(new int[]{1, 0, 1}));
    }

    @Test
    public void testSimpleTrackMustDecrease() throws Exception {
        assertThat(racingInstructor.getInstructions(new int[]{4, 4, 4, 4, 4, 4, 1}),
                is(new int[]{1, 1, 1, -1, -1, -1, 1}));
    }

    @Test
    public void testTrack1() throws Exception {
        int[] track = {4, 4, 4, 4, 4, 3, 3, 3, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 3, 3, 3, 2, 3, 3, 3, 4, 4, 4, 4, 4};
        assertThat(racingInstructor.getInstructions(track),
                is(new int[]{1, 1, 1, 0, -1, 0, 0, -1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 1, 0, 0, 1, 0, 0, 0, 0, 0}));
    }

    @Test
    public void testTraczk2() throws Exception {
        int[] track = {4, 4, 4, 4, 4, 2, 4, 4, 4, 4, 4, 2, 4, 4, 4, 4, 4, 2, 4, 4, 4, 4, 4, 1, 3, 4, 4, 4, 2, 4, 4, 4, 2, 4, 4, 4, 2, 4, 4, 4, 1, 3, 4, 4};
        assertThat(racingInstructor.getInstructions(track),
                is(new int[]{1, 1, 1, -1, -1, 1, 1, 0, 0, -1, -1, 1, 1, 0, 0, -1, -1, 1, 1, 0, -1, -1, -1, 1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, 1, 0, -1, -1, 1, 1, 1, 0}));
    }

    @Test
    public void testCircularTrackSlowDownAtEnd() throws Exception {
        assertThat(racingInstructor.getInstructions(new int[]{1, 4, 4, 4, 4, 4}),
                is(new int[]{1, 1, 1, -1, -1, -1}));
    }
}
