package com.ironhack.main;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = { 5, 2, 1, 4, -10 };

        // Exercise 1
        System.out.println(difference(numbers));

        // Exercise 2
        twoSmallest(numbers);

        // Exercise 3
        resolveExpression(3, 4);


    }
    public static int difference(int[] numbers) {

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        // Find smallest and highest
        for (int number : numbers) {
            if (number < smallest) smallest = number;
            if (number > largest) largest = number;
        }

        // Calculate difference
        return largest - smallest;
    }

    public static void twoSmallest(int[] numbers) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest) {
                secondSmallest = number;
            }
        }

        System.out.println("smallest = " + smallest);
        System.out.println("second smallest = " + secondSmallest);
    }

    public static void resolveExpression(double x, double y) {
        System.out.println(Math.pow(x, 2) + Math.pow((4*y/5-x), 2));
    }
}
