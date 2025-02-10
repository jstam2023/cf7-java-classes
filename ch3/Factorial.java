package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculate n!
 */

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int facto = 1;
        int i = 1;

        System.out.println("Please insert input nums:");
        inputNum = scanner.nextInt();


        // facto
        while (i <= inputNum) {
            facto *=i;
            i++;
        }

        System.out.println("Factorial: " + facto);



    }
}
