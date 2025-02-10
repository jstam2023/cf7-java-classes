package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα 2 ακεραίων με
 * τη χρήση μεθόδων.
 */

public class AddApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 10;
        int b = 5;
        int sum;
        int sub;

        System.out.println("Please enter 2 integers:");
        a= scanner.nextInt();
        b= scanner.nextInt();

        sum = add(a, b);
        sub = sub(a, b);

        System.out.println(sum);
        System.out.println(sub);

    }
    public static int add(int a, int b) {
        int result = 0;
        result= a+b;

        //return result;

        return a + b;
    }

    public static  int sub(int a, int b) {
        return a - b;
    }
}
