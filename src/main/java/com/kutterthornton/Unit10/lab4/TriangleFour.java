package com.kutterthornton.Unit10.lab4;

public class TriangleFour {
    private int size;
    private String letter;

    public TriangleFour() {
        size = 0;
        letter = "";
    }

    public TriangleFour(int count, String let) {
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

        for (int i = size; i > 0; i--) {
            // loop and print the spaces before the letter
            for (int j = -1; j < size - i - 1; j++) {
                output += " ";
            }
            for (int j = 0; j < i; j++) {
                output += letter;
            }
            output += "\n";
        }

        return output;
    }
}


