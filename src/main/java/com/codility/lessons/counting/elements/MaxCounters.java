package com.codility.lessons.counting.elements;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maxCounter = 0;

        for (int k = 0; k < A.length; k++) {
            int x = A[k];

            if (1 <= x && x <= N) {
                counters[x-1] += 1;

                if (maxCounter < counters[x-1]) {
                    maxCounter++;
                }

            } else if (x == N + 1) {
                for (int j = 0; j < counters.length; j++) {
                    counters[j] = maxCounter;
                }
            }
        }

        return counters;
    }
}
