package AssignmentOne;

import java.util.Scanner;

public class StringEndsWith {

    public static void main(String args[]){


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter one String");
        String str1 = scanner.nextLine();

        System.out.println("Enter the String to compare with the end of String 1 : ");
        String str2 = scanner.nextLine();

        boolean res = str1.endsWith(str2);

        if(res==true)
        System.out.println("The String ends with the same sequence");
        else
        System.out.println("The String does not end with same sequence");

    }
}
