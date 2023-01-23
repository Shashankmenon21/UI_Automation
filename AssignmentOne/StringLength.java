package AssignmentOne;

import java.util.Scanner;

public class StringLength {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter one String");
        String str = scanner.nextLine();

        int len = str.length();

        System.out.println("The length of the string is : "+len);

    }

}
