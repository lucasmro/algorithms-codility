package com.codility.lessons.arrays;

import java.util.Arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int n = A.length;

        if (n < 2) {
            return A;
        }

        int[] tmp = Arrays.copyOf(A, n);

        while (K-- > 0) {
            int last = tmp[n - 1];

            if (n == 2) {
                tmp[1] = tmp[0];
            } else {
                for (int i = n - 2; i > 0; i--) {
                    int x = tmp[i];
                    tmp[i] = tmp[i - 1];
                    tmp[i + 1] = x;
                }
            }

            tmp[0] = last;
        }

        return tmp;
    }
}
