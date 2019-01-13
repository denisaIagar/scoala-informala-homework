/**
 * Display the max digit from a number. Read the number from keyboard
 */


package com.sci.bv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("the max digit is: "+ maxDigit(n));

    }
    public static int maxDigit(int n) {
        n = Math.abs(n);
        if (n > 0) {
            int digit = n % 10;
            int max = maxDigit(n / 10);
            return Math.max(digit, max);
        } else {
            return 0;
        }
    }
}
