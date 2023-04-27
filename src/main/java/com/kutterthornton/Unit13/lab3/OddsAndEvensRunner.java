package com.kutterthornton.Unit13.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class OddsAndEvensRunner
{
    public static void main( String args[] )
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the number of integers:");
        //Get the number of integers to be enter by the user.
        int arrayLength = kb.nextInt();

        //Create array the same length as the number of entegers to be entered
        int[] arr = new int[arrayLength];

        System.out.print("Enter " + arrayLength + " integers separated by a space:");

        //Get the integers from the user
        for (int i = 0; i < arrayLength; i++)
        {
            arr[i] = kb.nextInt();
        }


        System.out.println("Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(arr)));
        System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(arr)));

    }
}
