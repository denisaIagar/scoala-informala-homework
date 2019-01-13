/**
 * Calculate the sum of the first 100 numbers higher than 0.
 */
package com.sci.bv;

public class Main {

    public static void main(String[] args) {
        int num = 100;
        int sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }
}
