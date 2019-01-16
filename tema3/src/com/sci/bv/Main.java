package com.sci.bv;

import java.util.Scanner;
/**
 * a program that reads three numbers from the console and prints the biggest of them.
 * @author Iagar Denisa
 */
public class Main {
    /**
     *  Use the getMax() method and prints
     *  the biggest number.
     *   @param args unused.
     */

    public static void main(String[] args) {
        System.out.println("Read the first number: ");

        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();

        System.out.println(" Read the second number: ");
        int secondNum = input.nextInt();

        System.out.println("Read the third number: ");
        int thirdNum = input.nextInt();

        int max = Math.max(getMax(firstNum,secondNum),thirdNum);
        System.out.println("The biggest number is: "+ max);
    /**
     *  returns maximal of the two numbers
     *  @param num1 the first number
     *  @param num2 the second number
     *  @return the max number
    */

    }
    private static int getMax (int firstNum, int secondNum){
       int max = firstNum;
        if ( secondNum > max){
           max = secondNum;
       }
       return max;

    }

    }

