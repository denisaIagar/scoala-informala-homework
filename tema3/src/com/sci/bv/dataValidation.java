package com.sci.bv;

import java.util.Scanner;

public class dataValidation {
    /**
     * Asks the user what time it is, by printing on the console "What time is it?"
     * @param args
     */

    public static void main(String[] args) {
        System.out.println( " What time is it?");

        Scanner  input= new Scanner(System.in);
        System.out.print("Houres: ");
            int houre = input.nextInt();

        System.out.print("Minutes: ");
            int minutes = input.nextInt();

        dataTime(houre, minutes);
    }

    /**
     * Use the validateDate() method
     * and output the date with a message
     * Check if the data is valid
     * the output the data
     * @param houre
     * @param minutes
     */
    private static void dataTime(int houre, int minutes){
        if ((houre < 0 || houre > 23) || (minutes < 0 || minutes > 59)){
            System.out.println("Invalid time");
        }
        else  {
            System.out.println( "The time is: " + houre + ":" + minutes);
        }
    }
}
