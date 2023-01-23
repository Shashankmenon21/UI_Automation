package AssignmentTwo;

import java.util.Scanner;

public class SmallestAmongThreeNos {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number : ");
        int num3 = scanner.nextInt();

        if(num1>=0 && num2>=0 && num3>=0) {
            if (num1 < num2 && num1 < num3) {
                System.out.println("Smallest number is : " + num1);
            }

            if (num2 < num1 && num2 < num3) {
                System.out.println("Smallest number is : " + num2);
            }

            if (num3 < num2 && num3 < num1) {
                System.out.println("Smallest number is : " + num3);
            }

            if(num1==num2 && num2==num3){
                System.out.println("All three numbers are equal");
            }
        }
        else{
            System.out.println("The number(s) entered are invalid");
        }
    }
}
