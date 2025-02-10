package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Demo of switch / case
 */


/**
public class SwitchCaseApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
            System.out.println("1. One-player game");
            System.out.println("2. Two-player game");
            System.out.println("3. Team game");
            System.out.println("4. Quit");

            choice = scanner.nextInt();

            if (choice < 1 || choice > 4) {
                System.out.println("Choice must be between 1-4");
                System.out.println("Try again");
                continue;
            }

            if (choice == 1 ) {
                System.out.println("One Player game starting...");
            }


            while (choice !=4);

        }
    }
}
*/