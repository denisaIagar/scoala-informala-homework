/**
 *  Check if a number is a palindrome
 */
package com.sci.bv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String numString = String.valueOf(num);
        String reverseNumString = new StringBuilder(numString).reverse().toString();

        if(numString.equals(reverseNumString)) {
            System.out.println(num + " is a Palindrome!");
        }
        else {
            System.out.println(num + " is not a Palindrome!");
        }

    }
    }

