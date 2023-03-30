package com.kutterthornton.Unit12.Lab6;

import java.io.File;
import java.util.Scanner;

public class PrimesRunner {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(new File("/Users/kutterthornton/Desktop/FIles/Code/Computer-Science-II---Files/src/main/java/com/kutterthornton/Unit12/Lab6/primes.dat"));

        while (keyboard.hasNext()) {
            int num = keyboard.nextInt();
            Prime p = new Prime(num);
            System.out.println(p);
        }

    }
}
