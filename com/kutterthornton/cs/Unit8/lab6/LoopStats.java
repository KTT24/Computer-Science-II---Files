package com.kutterthornton.cs.Unit8.lab6;

public class LoopStats {
    // instance variables
    private int start, stop;

    public LoopStats()
    {
        // Initialise instance variables initial value
        start = 0;
        stop = 0;
    }

    public LoopStats(int beg, int end)
    {
        // // Set the instance variables equal to the numbers variables
        start = beg;
        stop = end;
    }

    public void setNums(int beg, int end)
    {
        // Set the instance variables equal to the numbers variables
        start = beg;
        stop = end;
    }

    public int getEvenCount()
    {

        int evenCount = 0; // Create a counter for the even numbers

        // Loop through the numbers
        for (int i = start; i <= stop; i++) {
            if (i % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount; // Return the number of even numbers
    }

    public int getOddCount()
    {
        int oddCount = 0; // Create a counter for the odd numbers

        // Loop through the numbers
        for (int i = start; i <= stop; i++) {
            if (i % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount; // Return the number of odd numbers
    }

    public int getTotal()
    {
        int total = 0; // Create a counter for the total

        // Loop through the numbers
        for (int i = start; i <= stop; i++) {
            total += i;
        }
        return total; // Return the total
    }

    public String toString()
    {
         /* ==================== OUTPUT ====================
             EX: if 1 and 5 are entered, the output should be:
             total 15
             even 2
             odd 3
            ================================================ */
        return start + " " + stop + "total " + getTotal() + "\n even count " + getEvenCount() + "\n odd count " + getOddCount(); // Return the results
    }
}

