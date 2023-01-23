package AssignmentOne;

import java.util.Scanner;

public class ReplaceCharInString {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter one String");
        String str = scanner.nextLine();

        System.out.println("Enter the character to be replaced in the string : ");
        char ch1 = scanner.next().charAt(0);

        System.out.println("Enter the character to replace the previously entered character : ");
        char ch2 = scanner.next().charAt(0);
        
        String newstr = str.replace(ch1,ch2);
        System.out.println("The new string is : "+newstr);

    }
}
