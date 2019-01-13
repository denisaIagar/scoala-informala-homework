/**
 * Input 2 values: start and finish, then display the numbers from start to finish.
 */
package com.sci.bv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" please enter your start value:");
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        System.out.println(" please enter your finish value: ");
        int finish = input.nextInt();
        for (int i = start;i<= finish; i++){
            System.out.println("the numbers are: " + i);

        }
    }
}
