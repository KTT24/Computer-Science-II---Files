package com.kutterthornton.Unit12.lab3;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;

public class SocialRunner
{
    public static void main( String args[] ) throws IOException
    {
        Scanner file = new Scanner(new File("/Users/kutterthornton/Desktop/FIles/Code/Computer-Science-II---Files/src/main/java/com/kutterthornton/Unit12/lab3/social.dat"));

        int size = file.nextInt();
        file.nextLine();

        for (int i = 0; i < size; i++)
        {
            Social s = new Social(file.nextLine());
            out.println(s);
        }

        file.close();


    }
}
