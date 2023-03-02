package com.kutterthornton.Unit11.lab6;
import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFood
{
    private double amount;
    public String word;

    public DogFood() {
        amount = 0.0;
    }

    public DogFood(String line) {

        word = line;

    }

    public double getAmount() {
        Scanner scan = new Scanner(word);
        double cups = 0.0;
        while (scan.hasNext()) {
            int loc = scan.nextInt();
            if ((loc <= 4)) {
                cups += .5;
            } else if ((loc >= 5) && (loc <= 7)) {
                cups += 1.0;
            } else if ((loc >= 8) && (loc <= 9)) {
                cups += 1.5;
            } else if ((loc >= 10) && (loc <= 19)) {
                cups += 2.0;
            } else if ((loc >= 20) && (loc <= 39)) {
                cups += 3.5;
            } else if ((loc >= 40) && (loc <= 59)) {
                cups += 4.5;
            } else if ((loc >= 60) && (loc <= 79)) {
                cups += 6.0;
            } else {
                cups += 7.5;
            }
        }

        amount = (cups * 7) / 60;
        return amount;
    }

    public String toString() {
        // 1.633
        //2 - 10 POUND BAGS

        double bags = Math.ceil(getAmount());

        return String.format("%.3f", getAmount()) + "\n" + (int) bags + " - 10 POUND BAGS";
    }
}