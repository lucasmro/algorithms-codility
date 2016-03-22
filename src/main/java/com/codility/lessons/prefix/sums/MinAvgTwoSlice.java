package com.codility.lessons.prefix.sums;

public class MinAvgTwoSlice {
    public int solution(int[] A) {
        int n = A.length;
        int sum = 0;
        double minAvg = -1;
        int minP = -1;

        for (int p = 0; p < n - 1; p++) {
            sum = A[p];

            for (int q = p + 1; q < n; q++) {
                int length = q - p + 1;
                sum += A[q];
                double avg = sum / (double) length;

                if (minAvg == -1 || avg < minAvg) {
                    minAvg = avg;
                    minP = p;
                }
            }
        }

        return minP;
    }
}
