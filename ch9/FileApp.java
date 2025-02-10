package gr.aueb.cf.ch9;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileApp {
    public static void main(String[] args) {
        File fd = new File("file7.txt"); // C:\tmp\file7.txt  --> java converts it automatically if needed
        String line;
        String[] tokens;

        try (Scanner in = new Scanner(fd)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split("\\s+");  //regex \\s recognizes spases + means 1 or more

                for (String token : tokens) {
                    System.out.println(token + " ");
                }//end for
                System.out.println();
            }//end of while
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }//end main
}
