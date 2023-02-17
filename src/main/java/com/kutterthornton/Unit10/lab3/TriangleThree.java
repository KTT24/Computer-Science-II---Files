package com.kutterthornton.Unit10.lab3;

import static java.lang.System.*;

public class TriangleThree {
    private int size;
    private String letter;

    public TriangleThree() {
        size = 0;
        letter = "";
    }

    public TriangleThree(int count, String let) {
        size = count;
        letter = let;
    }

    public void setTriangle(String let, int sz) {
        size = sz;
        letter = let;
    }

    public String getLetter() {
        return letter;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < size; i++) {
            // loop and print the spaces before the letter
            for (int j = 0; j < size - i - 1; j++) {
                output += " ";
            }
            for (int j = 0; j <= i; j++) {
                output += letter;
            }
            output += "\n";
        }

        return output;
    }
}
