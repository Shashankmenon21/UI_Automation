package AssignmentOne;

import java.util.Scanner;

public class RemoveMaskStringChars {
    public static void main(String args[]) {

        int index=0;
        String strnew = "";
        String charToString="";
        String [] newstr = new String[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the main String");
        String str = scanner.nextLine();

        System.out.println("Enter the mask String");
        String mask = scanner.nextLine();

        char arr[] = mask.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            charToString = (String.valueOf(arr[i]));
            newstr[i]=str.replace(charToString,"");
            str=newstr[i];
            index=i;

        }

        System.out.println("The string after all characters are replaced, becomes : "+newstr[index]);

    }
}