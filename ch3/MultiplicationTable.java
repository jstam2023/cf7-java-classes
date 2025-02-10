package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *Δίνει ώς output τον πολλαπλασιασμό ενός ακεραίου
 * που δίνειο χρήστης με όλους τους ακεραίους απο 1- 10
 */

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int i = 1;

        System.out.println("Enter an integer: ");
        num = scanner.nextInt();

        while (i<=10) {
            System.out.println(num + " * " + i + "  = " + (num*i));
            i++;
        }


    }
}
