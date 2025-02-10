package gr.aueb.cf.ch1;

import java.util.Scanner;

public class DateTimeToSecondsConverter {

    /**
     * Μετατρέπει ημέρες, ώρες, λεπτά δευτερόλεπτα,
     * σε συνολικά δευτερόλεπτα. Ο χρήστης δίνει τα
     * δεδομένα και εκτυπώνεται το τελικό αποτέλεσμα
     */
    public static void main(String[] args) {
        //Μεταβλητές
        int days=0;
        int hours=0;
        int mins=0;
        int secs=0;
        int totalSeconds=0;

        //Εντολές
        Scanner scanner= new Scanner(System.in);
        System.out.println("Give days hours min and secs to convert to seconds:");
        days=scanner.nextInt();
        hours=scanner.nextInt();
        mins=scanner.nextInt();
        secs=scanner.nextInt();
        totalSeconds=secs+(mins*60)+(hours*3600)+(days*24*3600);

        System.out.printf("%d days %d hours %d mins and %d secs are total seconds: %,d", days, hours,mins,secs,totalSeconds);




    }
}
