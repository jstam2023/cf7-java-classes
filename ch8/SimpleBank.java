package gr.aueb.cf.ch8;

import java.util.IllformedLocaleException;
import java.util.Scanner;

public class SimpleBank {
        static double balance = 500;
        static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {


    }//end main

    public static void deposit(double amount) throws IllegalArgumentException {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be positive.");

            }
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        }catch (IllegalArgumentException e) {
            System.err.println("error. " + e.getMessage());
            throw e;

        }
    }//end deposit()

}
