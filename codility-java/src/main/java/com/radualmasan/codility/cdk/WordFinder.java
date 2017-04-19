package com.radualmasan.codility.cdk;

import java.util.Stack;

public class WordFinder {

    public boolean exists(String[] matrix, String word) {
        int[] positionOfFirstLetter = findPositionOfFirstLetter(matrix, word.charAt(0));

        if (positionOfFirstLetter == null)
            return false;

        Stack<int[]> visited = new Stack<>();
        visited.add(positionOfFirstLetter);
        while (true) {
            if (visited.size() == 0)
                return false;
            else if (visited.size() == word.length())
                return true;

            char currentLetter = word.charAt(visited.size());
            int[] currentPosition = visited.peek();

            if (isCharAbove(matrix, currentLetter, currentPosition))
                visited.add(new int[]{currentPosition[0], currentPosition[1] - 1});
            else if (isCharLeft(matrix, currentLetter, currentPosition))
                visited.add(new int[]{currentPosition[0] - 1, currentPosition[1]});
            else if (isCharBottom(matrix, currentLetter, currentPosition))
                visited.add(new int[]{currentPosition[0] + 1, currentPosition[1]});
            else if (isCharRight(matrix, currentLetter, currentPosition))
                visited.add(new int[]{currentPosition[0], currentPosition[1] + 1});
            else
                visited.pop();
        }
    }

    private boolean isCharAbove(String[] matrix, char currentLetter, int[] pos) {
        int x = pos[0];
        int y = pos[1];
        return y > 0 && matrix[y - 1].charAt(x) == currentLetter;
    }

    private boolean isCharLeft(String[] matrix, char currentLetter, int[] pos) {
        int x = pos[0];
        int y = pos[1];
        return x > 0 && matrix[y].charAt(x - 1) == currentLetter;
    }

    private boolean isCharBottom(String[] matrix, char currentLetter, int[] pos) {
        int x = pos[0];
        int y = pos[1];
        return y < matrix.length - 1 && matrix[y + 1].charAt(x) == currentLetter;
    }

    private boolean isCharRight(String[] matrix, char currentLetter, int[] pos) {
        int x = pos[0];
        int y = pos[1];
        return x < matrix[y].length() && matrix[y].charAt(x + 1) == currentLetter;
    }

    private int[] findPositionOfFirstLetter(String[] matrix, char c) {
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length(); x++) {
                if (matrix[y].charAt(x) == c) {
                    return new int[]{x, y};

                }
            }
        }

        return null;
    }
}
