package gr.aueb.cf.ch6;

/**
 * Δήλωση και αρχικοποίηση ενός πίνακα
 * Populate ένα πίνακα
 * -new
 * -unsized init
 * -array initializer
 * print τα στοιχεία ενός πίνακα
 */

public class ArrayInit {
    public static void main(String[] args) {
        int[] arr = new int[3]; //declare and initialize
        int[] arr2 = {1, 2, 3, 4, 5};
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 60;
        System.out.println("Array");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nArray2");
        for (int el : arr2) {
            System.out.print(el + " ");
        }
    }
}


