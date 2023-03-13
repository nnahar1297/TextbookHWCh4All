/**
 * @Class: Exercise7
 * @author: Nazmun Nahar
 * @Course: ITEC 2140
 * @Version: 1.1
 * @Date: Mar 13, 2023
 * Description: this program will compare between two strings
 */

import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter str1: ");
        String str1 = input.nextLine();
        System.out.println("Enter str2: ");
        String str2 = input.nextLine();

        String str3 = str1 + " " + str2;

        int str1Len = str1.length();
        int str2Len = str2.length();
        int compare = str1.compareTo(str2);

        System.out.println("Sample output for values " +str1+ " and " +str2);
        if(str1Len > str2Len)
            System.out.println("String " +str1+ " is longer than String " +str2);
        else
            System.out.println("String " +str2+ " is longer than String " +str1);

        if(compare < 0)
            System.out.println("String " +str1+ " appears before String " +str2+ " in lexicographic order");
        else if (compare == 0)
            System.out.println("String " +str1+ " and " +str2+ " both are same");
        else
            System.out.println("String " +str2+ " appears before String " +str1+ " in lexicographic order");

        System.out.println("New sentence created is " +str3);
    }
}
