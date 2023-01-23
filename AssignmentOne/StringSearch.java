package AssignmentOne;

import java.util.Scanner;

public class StringSearch {

    public static void main(String args[]) {

        String str = "";    //Initializing String variable
        StringSearch inst = new StringSearch();     //Creating an instance of class

        System.out.println("Enter the String to be searched : ");
        Scanner scanner = new Scanner(System.in);   //Creating object of Scanner class

        //Scanner can fetch String input
        str = scanner.nextLine();
        System.out.println("Enter the character you want to search : ");
        char ch = inst.nextChar(scanner);   /*Calling an instance method using instance variable
                                              to fetch a char using Scanner Class*/
        int index = str.indexOf(ch);        //Fetching index of search char from String

        if (index != -1)     // if index indicates successful execution print the index where search char was found
            System.out.println("The value of the index is : " + index);
        else              // if index value indicates unsuccessful execution print the relevant error message
            System.out.println("The character specified for search is not found");

    }

    /*
        Scanner doesn't provide method to accept char by default
        Using str.charAt() method to fetch the search char
        Return to calling function nextChar in main method
    */
    public char nextChar(Scanner scanner) {

        char ch = 0;

        ch = scanner.next().charAt(0);  //Fetch char from String input

        //if char is space or newline then terminate after printing appropriate message
        if (ch == ' ' || ch == '\n') {
            System.out.println("The character specified for search is invalid");
            System.exit(1);
        }

        //else return search char fetched to the calling function
        return ch;

    }
}