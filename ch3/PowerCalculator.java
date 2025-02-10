package gr.aueb.cf.ch3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {
        int base = 0;
        int power = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Insert base and power: ");
        base = in.nextInt();
        power = in.nextInt();
        int i = 1;
        int result = 1;

        while (i <= power) {
            result *=base; //result = result * base
            i++;
        }

        System.out.println("Result: " + result);


    }
}
