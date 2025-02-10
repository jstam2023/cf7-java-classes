package gr.aueb.cf.ch7;

/**
 * Τα Strings είναι immutable και δεν
 * επηρεάζει το αντιγραφο της αναφοράς.
 * Οπότε έχουμε εγκυρο copy με αντιγραφή της
 * αναφοράς.
 */
public class StrCopy {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = s1;

    }// end of main
}
