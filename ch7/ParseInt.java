package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * μετατρέπει ένα String σε ακέραιο.
 */
public class ParseInt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        String s;

        System.out.println("Please insert an integer: ");
        s = in.nextLine();
        num = Integer.parseInt(s);

        System.out.println(num);
    }//end of main
}
