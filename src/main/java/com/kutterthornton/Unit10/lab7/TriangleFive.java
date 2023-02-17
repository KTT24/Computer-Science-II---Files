package com.kutterthornton.Unit10.lab7;

public class TriangleFive {
    private char letter;
    private int amount;

    public TriangleFive() {
        amount = 0;
    }

    public TriangleFive(char c, int amt) {
        letter = c;
        amount = amt;
    }

    public void setLetter(char c) {
        c = letter;
    }

    public void setAmount(int amt) {
        amt = amount;
    }

    public String toString() {
        String output = "";

        char newLetter = letter;

        // Prints the columns
        for (int i = 0; i < amount; i++) {

            // Prints the rows
            for (int j = 0; j < amount - i; j++) {

                // Prints the letters in the row with one less letter each time
                for (int k = 0; k < amount - j; k++) {
                    output += newLetter;
                }

                // Adds a space between each row except the last one
                if (j != amount - i - 1) { output += " "; }

                // Increments the letter
                newLetter = (char) (newLetter + 1);

                // Resets the letter to A if it goes past Z
                if (newLetter > 'Z') { newLetter = 'A'; }
            }

            // Resets the letter to the original letter
            newLetter = letter;

            // Adds a new line
            output += "\n";
        }
        return output;
    }
}

