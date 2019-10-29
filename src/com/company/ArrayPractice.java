package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");

            for (int i = 0; i < colors.size(); i++)
                if (i == 1) {
                    System.out.println(colors.get(i));
                }

        System.out.println("Please add colors and quit by typing stop: ");

            boolean repeat = true;
            do {

            String s = scanner.nextLine();
            if (s.equalsIgnoreCase("stop")){
                repeat = false;
            }
            else{
                colors.add(s);
            }


        } while (repeat);

        for (String c : colors) {
            System.out.println(c);
        }

        for (int i = 0; i < colors.size(); i++)
            if (i == 5) {
                System.out.println(colors.get(i));
            }


    }
}
//  For reference (if needed):
//
//Java Collections
//
//Iterating through ArrayLists
//
//Try the following exercises:
//
// 1. Write a Java program to create a new array list to hold colors.

// 2. Add at least 3 colors (string) to the array list and print out
//  all its values.

// 3. Using the array list created above, print out the value at index 1.

// 4. Using the array list above, prompt the user for one new color,
// and add that color to the array list.

// 5. Using the array list, continue prompting the user for colors
//    until they type in "Q" or "q" to quit. Each time the user enters a color,
//     add that to the array list. Print out the list at the end.