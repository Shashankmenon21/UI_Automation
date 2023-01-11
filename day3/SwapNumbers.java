package day3;

public class SwapNumbers {

    public static void main(String args[]) {

        int a = 10;
        int b = 20;
        int temp = 0;

        System.out.println("Value of a is : " + a);
        System.out.println("Value of b is : " + b);


        /*
        Using a temporary variable to hold value
        while swapping numbers using assignment operator.
        */

        temp = a;
        a = b;
        b = temp;


        System.out.println("Numbers have been swapped!");
        System.out.println("Value of a is : " + a);
        System.out.println("Value of b is : " + b);
    }
}