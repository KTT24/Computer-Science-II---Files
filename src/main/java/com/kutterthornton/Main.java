package com.kutterthornton;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        String doubles = "1.5   7.4   9.3   3.2   2.0";
        Scanner chopAh = new Scanner(doubles);
        while(chopAh.hasNextDouble())
        {
            double val = chopAh.nextDouble();
            out.println(val);
        }

    }

}