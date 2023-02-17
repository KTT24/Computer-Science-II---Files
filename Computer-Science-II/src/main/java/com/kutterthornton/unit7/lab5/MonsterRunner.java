package com.kutterthornton.unit7.lab5;

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
    public static void main( String args[] )
    {
        Scanner keyboard = new Scanner(System.in);

        //ask for name and size
        System.out.print("Enter 1st monster's name : ");
        String name1 = keyboard.next();
        System.out.print("Enter 1st monster's size : ");
        int size1 = keyboard.nextInt();

        //instantiate monster one
        Monster one = new Monster(name1, size1);
        out.println("Monster 1 - " + one);



        //ask for name and size
        System.out.print("Enter 2nd monster's name : ");
        String name2 = keyboard.next();
        System.out.print("Enter 2nd monster's size : ");
        int size2 = keyboard.nextInt();

        //instantiate monster two
        Monster two = new Monster(name2, size2);
        out.println("Monster 2 - " + two);

        out.println("Monster 1 -" + one);
        out.println("Monster 2 -" + two);

        if (one.isBigger(two)) {
            out.println("Monster one is bigger than Monster two.");
        } else if (one.isSmaller(two)) {
            out.println("Monster one is smaller than Monster two.");
        } else {
            out.println("Monster one is the same size as Monster two.");
        }

        if (one.namesTheSame(two)) {
            out.println("Monster one has the same name as Monster two.");
        } else {
            out.println("Monster one does not have the same name as Monster two.");
        }



    }
}
