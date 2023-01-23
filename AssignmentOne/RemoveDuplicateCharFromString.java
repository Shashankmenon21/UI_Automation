package AssignmentOne;

import com.sun.jdi.Value;

import java.util.Scanner;

public class RemoveDuplicateCharFromString {

    public static void main(String args[]) {

        int dup = 0;
        int k = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter one String");
        String str1 = scanner.nextLine();
        String[] strnew = new String[100];
        strnew[0] = str1;

        char arr[] = str1.toCharArray();

        for (int i=0;i< arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                System.out.println("Comparing "+arr[i]+" with "+arr[j]);
                if (arr[i] == arr[j]) {
                    dup++;
                    System.out.println("duplicates found : "+dup);
                    for(int z=j;z<arr.length-1;z++)
                    arr[z]=arr[z+1];
                    System.out.println(String.valueOf(arr));
                    k++;
                    strnew[k] = String.valueOf(arr);
                    System.out.println("New string : "+strnew[k]);
                  }
                }

            }

           // System.out.println("The final string is : "+strnew[k-1]);

        }
}

//eresources -> ersources
//First iteration
//eresource     arr[i]=e arr[j]=resource
//Pick leftmost char, starting with the subsequent char traverse to the right matching one char at a time
//Second iteration
//rsourc        arr[i]=r arr[j]=sourc
//If char match is found, increment dup and push matching char to an array
//Third iteration
//souc          arr[i]=s arr[j]=ourc

/*
1)eresources
e->resources
2)ersourcs
r->sourcs
3)ersoucs
s->oucs
4)ersouc
o->uc
5)ersouc
u->c
6)ersouc -> done*/