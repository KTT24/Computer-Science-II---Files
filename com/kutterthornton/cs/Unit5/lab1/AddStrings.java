package com.kutterthornton.cs.Unit5.lab1;

public class AddStrings {
    private String first, last;
    private String sum;

    public AddStrings() {
        first = "";
        last = "";
        sum = "";
    }

    public AddStrings(String one, String two) {
        first = one;
        last = two;
        sum = "";
    }

    public void setStrings(String one, String two) {
        first = one;
        last = two;
    }

    public void add( ) {
        // add string one to string two and store in sum
        sum = first + " " + last;

    }

    public String toString() {

        return "first :: " + first + "\nlast :: " + last + "\nsum :: " + sum;
    }
}
