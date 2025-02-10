package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπάρχει ένας μυστικός αριθμός και ο χρήστης με μια προσπάθεια
 * θα προσπαθήσει να τον βρεί
 */

public class SecretFinderErrorHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        boolean isSuccess = false;


        while (true) {
            System.out.println("Enter your number guess: ");
            num = scanner.nextInt();

            if (num != SECRET) {
                System.out.println("You haven't found the number");
                continue;
            }


            System.out.println("Bingo!");
            break;
        }

    }
}