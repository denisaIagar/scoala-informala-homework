package com.sci.bv;

import java.util.Scanner;
/**
 *  implements an application that for a given temperature measured in Fahrenheit degrees,
 *  outputs it in Celsius degrees
 */
public class fahrenheitToCelsius {
    /**
     *  Use the fahrenheitToCelsius() method
     *  and outputs in Celsius degrees
     *@param args unused.
     */
    public static void main(String[] args) {

        System.out.println("Please enter the temperature in Fahrenheit: ");

        Scanner input = new Scanner(System.in);
        double tempF = input.nextDouble();

        double tempC = toCelsius(tempF);

        System.out.println(" youre temp in celcsius: " + tempC);

        if (tempC > 37){
            System.out.println(" You are ill!!");
        }
    }

    /**
     * converts temperature from Fahrenheit to Celsius
     *
     *  @param tempF the temperature in Fahrenheit
     *  @return the temperature in Celsius
     * @param tempF
     * @return
     */

    public static double toCelsius (double tempF){
        return  ((tempF -32.0) *5/9);
    }
}


