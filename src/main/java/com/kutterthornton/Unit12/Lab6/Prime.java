package com.kutterthornton.Unit12.Lab6;

public class Prime {
    private int number;

    //constructor methods go here
    public Prime()
    {
        setPrime(0);
    }

    public Prime(int num)
    {
        setPrime(num);
    }


    public void setPrime(int num)
    {
        number = num;
    }

    //boolean isPrime()   goes here

    public boolean isPrime()
    {
        boolean prime = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            } else {
                prime = true;
            }
        }
        return prime;
    }





    public String toString()
    {
        return number + (isPrime() == false ? " IS PRIME." : " IS NOT PRIME.");
    }
}
