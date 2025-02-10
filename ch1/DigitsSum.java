package gr.aueb.cf.ch1;

import java.util.Scanner;

/**
 * Να λαμβάνει
 */


public class DigitsSum {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int leftDigit=0;
        int rightDigit=0;
        int sum=0;
        int inputNum;

        System.out.println("Please insert two digit number:");
        inputNum=scanner.nextInt();

        leftDigit=inputNum/10;
        rightDigit=inputNum%10;
        sum=leftDigit+rightDigit;

        System.out.printf("Input num: %d, left digit: %d, right digit: %d, Sum: %d",inputNum,leftDigit,rightDigit,sum);



    }
}
