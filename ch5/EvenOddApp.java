package gr.aueb.cf.ch5;

import java.util.Scanner;

public class EvenOddApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check if is odd or even:");
        int num;
        num = scanner.nextInt();

        System.out.println(num+" is even: "+isEven(num));
        System.out.println(num+ " is odd: "+isOdd(num));

    }
    public static boolean isEven(int num) {
        return num%2==0;

    }
    public static boolean isOdd(int num) {
        return num%2!=0;

    }
}
