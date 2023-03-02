package com.kutterthornton.Unit11.lab6;

import java.util.Scanner;

public class DogFoodRunner {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        DogFood test = new DogFood(keyboard.nextLine());

        System.out.println(test);
    }
}
