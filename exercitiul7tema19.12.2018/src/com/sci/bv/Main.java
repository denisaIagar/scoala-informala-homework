/**
 * Input the length of the side of a square, and display its area.  Produce an error message if the length is negative.
 */
package com.sci.bv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please insert the lenght of the square: ");
        Scanner input = new Scanner(System.in);
        int lenght = input.nextInt();
        if (lenght < 0){
            System.out.println("The lenght must be a positiv number! Please try again!");
        }
        else {
            System.out.println("The area is: "+ (2*lenght));
        }
    }
}
