package gr.aueb.cf.ch6;

public class ArrayHello {
    public static void main(String[] args) {
        int[] arr=new int[10]; //declare and initialize
        arr[0]=5;
        arr[1]=6;
        arr[2]=60;

        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}


