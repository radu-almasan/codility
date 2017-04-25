package com.radualmasan.codility.xtra;

import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.StreamSupport;

public class RacingInstructor {

    private static final int MAX_SPEED = 4;

    public int[] getInstructions(int[] track) {
        return StreamSupport.stream(new InstructionsSpectator(track), false)
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static class InstructionsSpectator extends Spliterators.AbstractSpliterator<Integer> {

        private final int[] track;

        private int currentSpeed = 1;
        private int currentPosition = 0;

        public InstructionsSpectator(int[] track) {
            super(track.length, ORDERED & SIZED);
            this.track = track;
        }

        @Override
        public boolean tryAdvance(Consumer<? super Integer> consumer) {
            if (currentPosition >= track.length)
                return false;

            final int action;
            int restriction1 = currentPosition < track.length - 1 ? track[currentPosition + 1] : MAX_SPEED;
            int restriction2 = currentPosition < track.length - 2 ? track[currentPosition + 2] : MAX_SPEED;
            int restriction3 = currentPosition < track.length - 3 ? track[currentPosition + 3] : MAX_SPEED;

            if (canIncreaseSpeed(restriction1, restriction2, restriction3))
                action = 1;

            else if (shouldMaintainSpeed(restriction1, restriction2, restriction3))
                action = 0;

            else
                action = -1;

            System.out.println(String.format("%d - %d - %d", track[currentPosition], currentSpeed, action));
            assert track[currentPosition] >= currentSpeed;
            consumer.accept(action);

            currentPosition++;
            currentSpeed += action;

            return true;
        }

        private boolean canIncreaseSpeed(int restriction1, int restriction2, int restriction3) {
            return currentSpeed < restriction1
                    && (currentSpeed + 1) - restriction2 <= 1
                    && (currentSpeed + 1) - restriction3 <= 2;
        }

        private boolean shouldMaintainSpeed(int restriction1, int restriction2, int restriction3) {
            return currentSpeed <= restriction1
                    && currentSpeed - restriction2 < 2
                    && currentSpeed - restriction3 < 3;
        }
    }
}
