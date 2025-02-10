package gr.aueb.cf.ch20;

public class RegExMain {

    public static void main(String[] args) {
        String s = "info@aueb.gr";
        String s1 = "Ring";
        String s2 = "Athens uni   of econ";
        System.out.println("Is the string red; " + isRed(s));
        System.out.println("Is the string red or green? " + isRedOrGreen(s));
        System.out.println("Is the string red|Red or green|Green: " + isrRedOrgGreen(s));
        System.out.println("Is the string beginning with a capital letter and ends in ing? " + beginsWithOneUpperCaseAndEndsIning(s1));
        System.out.println("Is the string beginning with any letter and ends in ing? " + isOneLetterEndsIng(s1));
        System.out.println(whitespaceDigit(s));
        System.out.println(anySymbol(s));
        System.out.println("is a vaild email? " + isEmail(s));
        System.out.println("is date? " + isDate("20/05/2024"));
        String[] tokens = doSplit(s2);
        for (String token : tokens) {
            System.out.print(token + " ");
        }

        String s3 = doReplace(s2);
        System.out.println();
        System.out.println(doReplace(s2));
        String name = "Tomas Cook";
        System.out.println(doReplaceBackReference(name));


    }//end main

    public static boolean isRed(String s) {
        return s.matches("red");
    }//end isRed

    /**
     * Ελέγχει (matches) αν το input string είναι red  ή green
     * @param s
     * @return
     */

    public static boolean isRedOrGreen(String s) {
        return s.matches("red|green");
    }//end isRedOrGreen

    /**
     * ελέγχει (matches) αν το input string
     * είναι "red" ή "Red" ή "green" ή "Green"
     * @param s
     * @return
     */

    public static boolean isrRedOrgGreen(String s) {
        return s.matches("[rR]ed|[gG]reen");
    }//end isrRedOrgGreen

    public static boolean beginsWithOneUpperCaseAndEndsIning(String s) {
        return s.matches("[A-Z]ing");
    }//end beginsWithOneUpperCaseAndEndsIning


    public static boolean isOneLetterEndsIng(String s) {
        return s.matches("[A-Za-z]ing");
    }//end beginsWithOneUpperCaseAndEndsIning

    public static boolean whitespaceDigit(String s) {
        return s.matches("\\s\\d");
    }

    public static boolean anySymbol(String s) {
        //return s.matches(".\\d");
        return s.matches(".[0-9]");
    }//end anySymbol

    public static boolean isEmail(String s) {
        return s.matches("\\w*\\.?\\w+@\\w+\\.[a-z]{2,4}");
    }//end isEmail

    public static boolean isDate(String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{4}");
    }//end isDate

    public static String[] doSplit(String s) {
        return s.split("\\s+");
    }//end doSplit()

    public static String doReplace(String s) {
        return s.replaceAll("\\s+", "&");
    }//end doReplace()

    public static String doReplaceBackReference(String s) {
        return s.replaceAll("(.+)\\s+(.+)", "$2 $1");
    }//end doReplaceBackReference



}
