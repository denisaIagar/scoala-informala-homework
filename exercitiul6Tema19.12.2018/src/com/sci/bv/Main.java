/**
 *  Input the dimensions of a rectangle and display area and perimeter.
 */
package com.sci.bv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("please enter the lenght:");
        Scanner input = new Scanner(System.in);
        int lenght = input.nextInt();
        System.out.println("please enter width: ");
        int width = input.nextInt();
        int perimeter = 2*(lenght*width);
        System.out.println("the perimeter is:"+ perimeter);
        int area = lenght* width;
        System.out.println("the area is: " + area);
    }
}
