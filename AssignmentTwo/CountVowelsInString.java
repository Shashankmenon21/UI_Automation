package AssignmentTwo;

import java.util.Scanner;

public class CountVowelsInString {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string to search for vowels : ");
        String str =scanner.nextLine();
        char ch[] = str.toCharArray();
        int noOfVowels=0;

        for(int i=0;i<str.length();i++) {


            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                noOfVowels++;
            }
        }

            System.out.println("Number of vowels is : "+noOfVowels);

    }
}
