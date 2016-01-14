package com.codility.lessons.interations;

public class BinaryGap {

    public int solution(int N) {
        String binary = convertFromDecimalToBinary(N);
        binary = removeTrailingZeros(binary);

        int count = 0;
        int maxCount = 0;

        for (int i = 1; i < binary.length() - 1; i++) {
            if (binary.charAt(i) == '0') {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }

        return maxCount;
    }

    private String convertFromDecimalToBinary(int n) {
        int quotient = n;
        int dividend = 2;
        int remainder = 0;
        String binaryTmp = "";

        while (quotient != 0) {
            remainder = quotient % dividend;
            quotient = quotient / dividend;
            binaryTmp += remainder;
        }

        return new StringBuilder(binaryTmp).reverse().toString();
    }

    private String removeTrailingZeros(String text) {
        int index = text.length();

        for (int i = text.length() - 1; i >= 0; i--) {
            if (text.charAt(i) != '0') {
                break;
            }
            index = i;
        }

        return text.substring(0, index);
    }
}
