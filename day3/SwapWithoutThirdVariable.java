package day3;

public class SwapWithoutThirdVariable {

    public static void main(String args[]) {

        int a = 13;
        int b = 3237;

        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);

        //Using arithmetic operators to swap values
        //Logic for Swapping values...
        //a = (a+b)-a
        //b = (a+b)-a
        System.out.println("Value of a : " + (a + b - a));
        System.out.println("Value of b : " + (a + b - b));

        System.out.println("Numbers have been swapped!");

    }
}
