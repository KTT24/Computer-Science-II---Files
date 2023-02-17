package com.kutterthornton.Unit8.lab9;

public class TriangleOne {
    private String word;

    public TriangleOne() {
        // initialise instance variables
        word = "";
    }

    public TriangleOne(String w) {
        // initialise instance variables
        word = w;
    }

    public void setWord(String w) {
        // initialise instance variables
        word = w;
    }

    public String getWord() {
        return word;
    }

    public String toString() {
        String output = "";
        for (int i = word.length(); i > 0; i--) {
            output += word.substring(0, i) + "\n";
        }
        return output;
    }
}
