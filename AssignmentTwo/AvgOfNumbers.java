package AssignmentTwo;

import java.util.Scanner;

public class AvgOfNumbers{

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the first number : ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the first number : ");
        int num3 = scanner.nextInt();

        int avg = (num1+num2+num3)/3;
        System.out.println("Average of the three numbers is : "+avg);

    }

}
