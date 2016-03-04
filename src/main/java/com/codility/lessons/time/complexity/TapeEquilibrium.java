package com.codility.lessons.time.complexity;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int n = A.length;
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += A[i];
        }

        int leftTotal = 0;
        int rightTotal = 0;
        int min = -1;

        for (int i = 0; i < n - 1; i++) {
            leftTotal += A[i];
            rightTotal = total - leftTotal;

            int diff = Math.abs((leftTotal - rightTotal));

            if (min == -1 || diff < min) {
                min = diff;
            }
        }

        return min;
    }
}
