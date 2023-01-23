package AssignmentOne;

import java.util.Scanner;

public class ContainStrings {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter one String");
        String str1 = scanner.nextLine();

        System.out.println("Enter the string to be searched");
        String search = scanner.nextLine();

        boolean res1 = str1.contains(search);

        if(res1==true)
        System.out.println("The string contain the specified sequence of characters.");
        else
        System.out.println("The string does not contain the specified sequence of characters.");

    }
}
