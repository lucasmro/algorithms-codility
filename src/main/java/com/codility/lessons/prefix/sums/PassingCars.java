package com.codility.lessons.prefix.sums;

public class PassingCars {
    public int solution(int[] A) {

        int N = A.length;

        int[] east = new int[N];
        int[] west = new int[N];

        int eastCount = 0;
        int westCount = 0;

        for (int i = 0; i < N; i++) {
            if (0 == A[i]) {
                east[eastCount++] = i;
            } else {
                west[westCount++] = i;
            }
        }

        int result = 0;

        for (int i = 0; i < eastCount; i++) {
            for (int j = 0; j < westCount; j++) {
                if (east[i] < west[j]) {
                    result++;
                }

                if (1000000000 == result) {
                    return -1;
                }
            }
        }

        return result;
    }
}
