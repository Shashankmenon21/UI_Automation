package day4;

import day3.Calculator;
import java.util.Scanner;

public class CalculatorWithScanner {

    public static void main(String args[]) {


        /*
            Creating a new object of Calculator class
            and assigning to reference variable named cal
        */
        Calculator cal = new Calculator();


        /*
            1)Take input from inputStream using Scanner class
            2)Then using reference variable cal to
              call functions in the Calculator class
              by passing a and b as arguments.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value for addition :");
        int a1 = scanner.nextInt();
        System.out.println("Enter second value for addition :");
        int b1 = scanner.nextInt();
        cal.addition(a1, b1);


        System.out.println("Enter first value for subtraction :");
        int a2 = scanner.nextInt();
        System.out.println("Enter second value for subtraction :");
        int b2 = scanner.nextInt();
        cal.subtraction(a2, b2);


        System.out.println("Enter first value for multiplication :");
        int a3 = scanner.nextInt();
        System.out.println("Enter second value for multiplication :");
        int b3 = scanner.nextInt();
        cal.multiplication(a3, b3);


        System.out.println("Enter first value for division :");
        int a4 = scanner.nextInt();
        System.out.println("Enter second value for division :");
        int b4 = scanner.nextInt();
        cal.division(a4, b4);


    }

}
