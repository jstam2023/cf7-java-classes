package gr.aueb.cf.ch7;

public class StrBuilderApp {

    public static void main(String[] args) {
        String concatStr = "";
        Long timeStart = 0L;
        Long timeEnd = 0L;
        double sbelapsedTime = 0.0;
        double elapsedTime = 0.0;
        double stringBuilderElapsedTime = 0.0;
        StringBuilder sb = new StringBuilder();

        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 90_000; i++) {
            concatStr = concatStr + i;
        }//end for
        timeEnd = System.currentTimeMillis();
        elapsedTime = (timeEnd - timeStart) / 1000.0;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 90_000; i++) {
            concatStr = concatStr + i;
        }//end for

        timeEnd = System.currentTimeMillis();
        sbelapsedTime = (timeEnd - timeStart) / 1000.0;

        System.out.println("String elapsed time: " + elapsedTime + " seconds");
        System.out.println("Sb elapsed time: " + sbelapsedTime + " seconds");


    }//end of main
}
