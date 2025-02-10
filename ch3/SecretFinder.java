package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπάρχει ένας μυστικός αριθμός και ο χρήστης με μια προσπάθεια
 * θα προσπαθήσει να τον βρεί
 */

public class SecretFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        boolean isSuccess = false;


        do {
            System.out.println("Enter your number guess: ");
            num = scanner.nextInt();

            if (num == SECRET) {
                System.out.println("You found the number is " + SECRET);
                isSuccess = true;
            } else {//num!=SECRET)
                System.out.println("You haven't found the number");
            }
        } while (!isSuccess);
        System.out.println(" Goodbye");
    }
    }
