package gr.aueb.cf.ch10;

public class StackApp {
    static int[] myStack = new int[50];
    static int top = -1;

    public static void main(String[] args) {

    }//end of main

    public static void push(int num) throws Exception{
        try{
            if (isFull()) throw new Exception("Error. Stack is full.");
            myStack[++top] = num;
        }catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }//end of push()

    public static int pop() throws Exception {
        try {
            if (isEmpty()) throw new Exception("Error.Stack is empty.");
            return myStack[top--];
        }catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static boolean isEmpty() {
        return top==-1;
    }//end of isEmpty()

    public static boolean isFull() {
        return top== myStack.length -1;
    }//end of isFull()


}
