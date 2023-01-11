
package day3;

public class Calculator {
    public static void main(String args[]) {

        int a = 20, b = 10;

        //Object and reference
        Calculator calculator = new Calculator();

        //Methods called
        calculator.addition(a, b);
        calculator.subtraction(a, b);
        calculator.multiplication(a, b);
        calculator.division(a, b);
        calculator.modulo(a, b);

    }

    //Functions of a Calculator defined below

    public int addition(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is : " + sum);
        return sum;
    }

    public int subtraction(int a, int b) {
        int diff = a - b;
        System.out.println("The difference is : " + diff);
        return diff;
    }

    public int multiplication(int a, int b) {
        int product = a * b;
        System.out.println("The product is : " + product);
        return product;
    }

    public int division(int a, int b) {
        int quotient = a / b;
        System.out.println("The quotient is : " + quotient);
        return quotient;
    }

    int modulo(int a, int b) {
        int remainder = a % b;
        System.out.println("The remainder is : " + remainder);
        return remainder;
    }
}
