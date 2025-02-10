package gr.aueb.cf.ch6;

public class ArrayDeepCopy {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,56,89};
        int[] copied;

        copied = arrDeepCopy(arr);



    }

    /**
     * It does a fresh copy of an array.
     * @param source
     * @return
     */

    public static int[] arrDeepCopy(int[] source) {
        int[] destination = new int[source.length];

        for (int i=0; i< source.length; i++) {
            destination[i] = source[i];
        }
        return destination;
    }
}
