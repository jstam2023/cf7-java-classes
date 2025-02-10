package gr.aueb.cf.ch8;

import java.io.IOException;

public class ExceptionTypes {

    public static void main(String[] args) {



    }//end main

    /**
     * System.in.read() throws IOException.
     * Since a checked exception is thrown, it has
     * to be explicity to be thrown in method signature.
     * Or has to be caught {}
     * When this type of method/exception may be used?
     * When no need to handle the exception.
     * Is this meaningful? No, ideally we want to handle
     * exceptions, not only propagate.
     *
     * @return
     * @throws IOException
     */

    public static char readOneChar() throws IOException {
        return (char) System.in.read(); // throws IOException
    }//end of readOneChar()

    /**
     * If we catch the exception, no need for 'throws'
     * in the method signature. And the exception not prapagates.
     * Is it a good practice, not to propagate?
     * It depends. If there is a caller, then we have to propagate.
     * If there is a client / user we do not propagate the exception.
     * @return
     */


    public static char readAnotherChar() {
        try{
            return (char) System.in.read();
        }catch (IOException e) {
            System.err.println(e.getMessage());
            return ' ';
        }
    }//end of readAnotherChar()

    /**
     * In this type of method / exception, we take
     * action -- logging, and also rethrow the exception
     * to propagate to the caller.
     * @return
     * @throws IOException
     */


    public static char readAnotherOneChar() throws IOException {
        try{
            return (char) System.in.read();
        }catch (IOException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }//end of readAnotherOneChar()

    public static char readAgainOneChar(char ch) throws IOException, IllegalArgumentException{
        try {
            char inputChar = (char) System.in.read();
            if (inputChar != ch) throw new IllegalArgumentException("Char not fit");
            return inputChar;
        } catch (IllegalArgumentException ex1) {
            ex1.printStackTrace();
            System.err.println(ex1.getMessage());
            throw ex1;
        }catch (IOException ex2) {
            ex2.printStackTrace();
            System.err.println(ex2.getMessage());
            throw ex2;
        }
    }//end of readAgainOneChar()


}
