package com.company;

import java.util.Scanner;

class ChangeCalculator {

    void calculateChange(double dollarAmount) {

        int quarters = (int) (dollarAmount/0.25);
        dollarAmount = dollarAmount - 0.25 * quarters;
        dollarAmount = (double) Math.round(dollarAmount * 100)/100; //round-up to nearest cent

        int dimes = (int) (dollarAmount/0.1);
        dollarAmount = dollarAmount - 0.1 * dimes;
        dollarAmount = (double) Math.round(dollarAmount * 100)/100;

        int nickels = (int) (dollarAmount/0.05);
        dollarAmount = dollarAmount - 0.05 * nickels;
        dollarAmount = (double) Math.round(dollarAmount * 100)/100;

        int pennies = (int) (dollarAmount/0.01);

        System.out.println("quarters:" + quarters + " dimes:" + dimes + " nickels:" + nickels + " pennies:" + pennies);
    }

}

public class Main {

    public static void main(String[] args) {

        int counter = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter dollar amount: ");
            double userInput = scanner.nextDouble();

            ChangeCalculator changeCalculator = new ChangeCalculator();
            changeCalculator.calculateChange(userInput);

            counter++;
        } while (counter < 3);

    }
}
