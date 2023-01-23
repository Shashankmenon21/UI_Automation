package AssignmentOne;

import java.util.Scanner;

public class ConcatenateStrings {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter one String");
        String str1 = scanner.nextLine();
        System.out.println("Enter second String");
        String str2 = scanner.nextLine();

        System.out.println("Concatenated String is : "+str1+str2);
    }
}
