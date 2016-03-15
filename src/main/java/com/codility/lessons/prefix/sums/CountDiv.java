package com.codility.lessons.prefix.sums;

public class CountDiv {
    public int solution(int A, int B, int K) {
        int count = 0;

        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                count++;
            }
        }

        return count;
    }
}
