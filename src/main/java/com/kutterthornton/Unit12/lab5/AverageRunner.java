package com.kutterthornton.Unit12.lab5;

import java.util.Scanner;
import static java.lang.System.*;
import java.io.IOException;
import java.io.File;

public class AverageRunner
{
    public static void main( String args[] ) throws IOException
    {
        Scanner file = new Scanner(new File("/Users/kutterthornton/Desktop/FIles/Code/Computer-Science-II---Files/src/main/java/com/kutterthornton/Unit12/lab5/average.dat"));

        int size = file.nextInt();

        for(int i=0; i<size; i++)
        {
            String line = file.nextLine();
            Average test = new Average(line);
            out.println(test);
        }
    }
}
