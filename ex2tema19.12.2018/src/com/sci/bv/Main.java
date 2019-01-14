//

//Display the smallest number from a collection of numbers

//

package com.sci.bv;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numbers []= new int[] {32, 4, 9, 6, 3, 17};
        int smallest = numbers[0];
        for (int i= 1; i< numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
            System.out.println(" the smallest number is: "+ smallest);
        }
        }








