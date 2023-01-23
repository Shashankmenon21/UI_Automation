package AssignmentOne;

import java.util.Scanner;

public class ContainsStringAndStringBuffer {

        public static void main(String args[]){

            Scanner scanner = new Scanner(System.in);


            System.out.println("Enter one String");
            String str1 = scanner.nextLine();


            StringBuffer str2 = new StringBuffer();
            str2.append("Hello");
            System.out.println("The string to be searched is : "+str2);

            boolean res1 = str1.contains(str2);

            if(res1==true)
                System.out.println("The two strings contain the same sequence of characters.");
            else
                System.out.println("The two strings do not contain the same sequence of characters.");

        }
    }


