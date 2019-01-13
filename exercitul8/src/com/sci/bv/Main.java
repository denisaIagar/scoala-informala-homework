/**
 * Input 3 numbers, and display the biggest
 */
package com.sci.bv;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tastatura = new Scanner(System.in);
        System.out.println(" Please enter your first number: ");
        int a = tastatura.nextInt();
        System.out.println(" Please enter your second number: ");
        int b = tastatura.nextInt();
        System.out.println(" Please enter your third number: ");
        int c = tastatura.nextInt();
             if(a > b && a > c)
        {
                System.out.println("Largest number is:"+a);
        }
                else if(b > c)
        {
                System.out.println("Largest number is:"+b);

        }     else
        {
                System.out.println("Largest number is:"+c);
        }

    }
}


