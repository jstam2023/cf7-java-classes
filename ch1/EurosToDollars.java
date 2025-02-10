package gr.aueb.cf.ch1;
import java.util.Scanner;

/**
 * Scanner Demo.Reads two integers from the
 * std input(keyboard) and calculates the result.
 */
public class EurosToDollars {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        int euros=0;
        int dollars= 0;
        final int PARITY=99;
        int totalCents=0;
        int usaCents=0;
        Scanner scanner = new Scanner(System.in);

        //Εντολές
        System.out.println("Give amount in Euros to convert to US Dollars: ");
        euros = scanner.nextInt();
        totalCents = euros*PARITY;
        dollars= totalCents/100;
        usaCents=totalCents%100;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Το ποσό των %d\u20AC είναι \u0024%d.%d", euros, dollars, usaCents);




    }
}
