package gr.aueb.cf.ch6;

public class CircularRotation {
    public static void main(String[] args) {

    }//end of main

    public static int[] doLeftShift(int[] arr, int offset) {
        if(arr == null) return null;
        if (offset < 0) return null;

        int[] rotated = new int[arr.length];

        for(int i = 0; i<arr.length; i++) {
            rotated[i] = arr[(i+offset) % arr.length];

        }//end for
        return rotated;
    }
    public static int[] doRightShift(int[] arr, int offset) {
        if(arr == null) return null;
        if (offset < 0) return null;

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++)  {
            rotated[(i + offset) % arr.length] = arr[i];
        }//end for

        return rotated;
    }


}
