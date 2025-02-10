package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δικαίωμα ψήφου σε ηλικίες > 18
 * Ελέγχει αν μια ηλικία έχει δικαίωμα να ψηφίσει
 */

public class VoteEligible {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        System.out.println("What is your age?");
        age = scanner.nextInt();
        boolean isEligible = age>=18;

        System.out.printf("Eligible for vote: " + isEligible);
    }
}
