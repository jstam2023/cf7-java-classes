package gr.aueb.cf.ch2;

import java.util.Scanner;

public class PriceWithVat {
    public static void main(String[] args) {

        final double VAT_RATE = 0.24;
        double inputPrice = 0.0;
        double priceWithVat = 0.0;
        double vat = 0.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give price: ");
        inputPrice = scanner.nextDouble();
        vat = inputPrice * VAT_RATE;
        priceWithVat = inputPrice + vat;

        System.out.printf("Price: %.2f, Vat: %.2f, Price with vat: %.2f", inputPrice, vat, priceWithVat);


    }
}
