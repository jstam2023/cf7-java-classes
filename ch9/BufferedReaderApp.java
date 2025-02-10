package gr.aueb.cf.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderApp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        try(BufferedReader bf = new BufferedReader(new FileReader("C:/tmp/bf-read.txt"))) {
            String line = "";

            while((line = bf.readLine()) !=null) {
                sb.append(line).append("\n");
            }//end while
        }catch (IOException e) {
            e.printStackTrace();
        }//end try-catch

        System.out.println(sb);

    }//end main
}
