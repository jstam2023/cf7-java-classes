package gr.aueb.cf.ch1;

import java.util.Scanner;

/**
 * Λαμβάνει τιμή θερμοκρασίας απο τον χρήστη και
 * εμφανίζει κατάλληλο μήνυμα
 */

public class TempApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp=0;
        boolean isTempBelowZero;

        System.out.println("Please insert the current temperature:");
        temp = scanner.nextInt();

        isTempBelowZero=temp<0;

        System.out.println("Temperature is below zero: "+isTempBelowZero);

    }
}
