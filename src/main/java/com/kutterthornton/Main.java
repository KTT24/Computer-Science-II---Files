package com.kutterthornton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class Main  {
    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(new File("/Users/kutterthornton/Desktop/FIles/Code/Computer-Science-II---Files/src/main/java/com/kutterthornton/nums.dat"));
        int size = file.nextInt();
        int count = 0;
        for(int i=1; i<=size; i++ )
        {
            int number = file.nextInt();
            if(number%2==0)
            count++;
        }
        out.println(count);
    }
}