package com.kutterthornton.Unit13.lab3;

import java.util.Scanner;

public class OddsAndEvens
{
    public static int countEm(int[] array, boolean odd)
    {
        //if odd = true count # of odds else count # of evens
        int count = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (odd)
            {
                if (array[i] % 2 != 0)
                {
                    count++;
                }
            }
            else
            {
                if (array[i] % 2 == 0)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static int[] getAllEvens(int[] array)
    {
        // STEP 1: *********************************************************************
        int numEvens = countEm(array,false);



        // STEP 2: *********************************************************************
        int [] tempArray = new int[numEvens];




        // STEP 3: *********************************************************************

        int k = 0;

        for (int i=0;  i<array.length; i++)
        {
            if(array[i] % 2 == 0)
            {
                tempArray[k] = array[i];
                k++;
            }
        }




        // STEP 4: *********************************************************************
        return tempArray;
    }

    public static int[] getAllOdds(int[] array)
    {
        int k = 0;
        int numOdds = countEm(array,true);
        int [] tempArray = new int[numOdds];

        for (int i=0;  i<array.length; i++)
        {
            if(array[i] % 2 == 1)
            {
                tempArray[k] = array[i];
                k++;
            }
        }
        return tempArray;
    }
}
