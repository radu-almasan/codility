package com.radualmasan.codility.xtra;

import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.StreamSupport;

public class RacingInstructor {

    private static final int MAX_SPEED = 4;

    public int[] getInstructions(int[] track) {
        return StreamSupport.stream(new InstructionsSpectator(track, MAX_SPEED), false)
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static class InstructionsSpectator extends Spliterators.AbstractSpliterator<Integer> {

        private final int[] track;
        private final int maxSpeed;
        private final int[] restrictionsBuffer;

        private int currentSpeed = 1;
        private int currentPosition = 0;

        public InstructionsSpectator(int[] track, int maxSpeed) {
            super(track.length, ORDERED & SIZED);

            this.track = track;
            this.maxSpeed = maxSpeed;
            restrictionsBuffer = new int[maxSpeed - 1];
        }

        @Override
        public boolean tryAdvance(Consumer<? super Integer> consumer) {
            if (currentPosition >= track.length)
                return false;

            for (int i = 1; i <= restrictionsBuffer.length; i++)
                restrictionsBuffer[i - 1] = track[(currentPosition + i) % track.length];

            final int action = canIncreaseSpeed(restrictionsBuffer) ? 1
                    : shouldMaintainSpeed(restrictionsBuffer) ? 0
                    : -1;

            System.out.println(String.format("%d - %d - %d", track[currentPosition], currentSpeed, action));
            assert track[currentPosition] >= currentSpeed;
            consumer.accept(action);

            currentPosition++;
            currentSpeed += action;

            return true;
        }

        private boolean canIncreaseSpeed(int[] upcomingRestrictions) {
            if (currentSpeed >= upcomingRestrictions[0])
                return false;

            for (int i = 1; i < upcomingRestrictions.length; i++)
                if ((currentSpeed + 1) - upcomingRestrictions[i] > i)
                    return false;

            return true;
        }

        private boolean shouldMaintainSpeed(int[] upcomingRestrictions) {
            if (currentSpeed > upcomingRestrictions[0])
                return false;

            for (int i = 1; i < upcomingRestrictions.length; i++)
                if (currentSpeed - upcomingRestrictions[i] >= i + 1)
                    return false;

            return true;
        }
    }
}
