package com.kutterthornton.Unit4.lab1;

public class Cube
{
    // Add the instance variables for side, surface area
    private int side;
    private int surfaceArea;

    public Cube() {
        // Default constructor for setting side to 0
        side = 0;

        // Default constructor for setting surfaceArea to 0
        surfaceArea = 0;
    }

    public void setSide(int s) {

        // Set side to s
        side = s;

        // Set surfaceArea to the result of calculateSurfaceArea()
        surfaceArea = 6 * side * side;
    }

    public int calculateSurfaceArea() {
        // Return the surface area of the cube
        return surfaceArea;
    }

    public String toString( ) {
        return "";
    }
}
