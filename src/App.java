import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        int[] inputInteger = {1,2,3,4,5};
        String inputString = "ABCDEFGHIKLM";
        LinkedList stack = new LinkedList();

        reserveIntegerArray(inputInteger, stack);
        reserveString(inputString, stack);
    }
    private static void reserveString(String inputString, LinkedList stack){

        String[] splitted = inputString.split("");
        for(int i = 0; i<splitted.length;i++){
            stack.push(splitted[i]);
        }
        System.out.println();
        System.out.println("After using stack to reserve string "+inputString +": ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
    private static void reserveIntegerArray(int[] inputInteger, LinkedList stack) {
        System.out.println("Array of int:");
        for (int e : inputInteger) {
            System.out.print(e + " ");
            stack.push(e);
        }
        System.out.println();
        System.out.println("After using stack to reserve array of in: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

    }
}
