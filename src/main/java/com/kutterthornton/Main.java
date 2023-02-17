package com.kutterthornton;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 6; i++) {
            for (int j = 1; j <= i; j++)
                out.print("*");
            out.println();
        }
    }
}