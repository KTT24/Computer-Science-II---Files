package com.kutterthornton.Unit13.lab2;

import java.util.Arrays;

public class ArrayFunHouseTwoRunner
{
    public static void main( String args[] )
    {
        //add test cases


        int[] one = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] two = {1,2,3,9,11,20,30};
        int[] three = {9,8,7,6,5,4,3,2,0,-2};
        int[] four = {3,6,9,12,15,18,21,23,19,17,15,13,11,10,9,6,3,2,1,0};


        System.out.println("GOING UP:");
        System.out.println(Arrays.toString(one));
        System.out.println("is going Up? " + ArrayFunHouseTwo.goingUp(one));
        System.out.println(Arrays.toString(two));
        System.out.println("is going Up? " + ArrayFunHouseTwo.goingUp(two));
        System.out.println(Arrays.toString(three));
        System.out.println("is going Up? " + ArrayFunHouseTwo.goingUp(three));
        System.out.println(Arrays.toString(four));
        System.out.println("is going Up? " + ArrayFunHouseTwo.goingUp(four) + "\n");

        System.out.println("GOING DOWN:");
        System.out.println(Arrays.toString(one));
        System.out.println("is going Down? " + ArrayFunHouseTwo.goingDown(one));
        System.out.println(Arrays.toString(two));
        System.out.println("is going Down? " + ArrayFunHouseTwo.goingDown(two));
        System.out.println(Arrays.toString(three));
        System.out.println("is going Down? " + ArrayFunHouseTwo.goingDown(three));
        System.out.println(Arrays.toString(four));
        System.out.println("is going Down? " + ArrayFunHouseTwo.goingDown(four) + "\n");



        System.out.println("GREATER VALUES:");

        int[] five = ArrayFunHouseTwo.getCountValuesBiggerThanX(four, 7, 9);
        int[] six = ArrayFunHouseTwo.getCountValuesBiggerThanX(four, 5, 15);


        System.out.println(Arrays.toString(four));
        System.out.println("first 7 values greater than 9 " + Arrays.toString(five));
        System.out.println("first 5 values greater than 15 " + Arrays.toString(six));
    }
}