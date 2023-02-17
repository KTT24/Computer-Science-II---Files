package com.kutterthornton.Unit5.lab1;

import static java.lang.System.*;
import java.util.Scanner;

public class AddRunner
{
    public static void main ( String[] args )
    {
        //Add Scanner object and ask user to enter two words.
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first word :: ");
        String one = keyboard.next();
        System.out.print("Enter the second word :: ");
        String two = keyboard.next();

        //Create AddStrings object passing the two words as arguments in to the constructor method
        AddStrings as = new AddStrings(one, two);


        //Call the add() method to concatenate the two words together
        as.add();

        //Add a print statement to print your object's toString() method output
        System.out.println(as.toString());

    }
}