package com.kutterthornton.Unit12.lab4;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;

public class BoxRunner
{
    public static void main( String args[] ) throws IOException
    {
        Scanner file = new Scanner(new File("src/main/java/com/kutterthornton/Unit12/lab4/box.dat"));

        int size = file.nextInt();

        for(int i = 0; i < size; i++)
        {
            String let = file.next();
            int num = file.nextInt();
            Box test = new Box(let, num);
            System.out.println(test);
        }
    }
}
