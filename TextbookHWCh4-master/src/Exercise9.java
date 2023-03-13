/**
 * @Class: Exercise9
 * @author: Nazmun Nahar
 * @Course: ITEC 2140
 * @Version: 1.1
 * @Date: Mar 13, 2023
 * Description: this program will reverse a string
 */

import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.nextLine();
        System.out.println("Enter a character: ");
        char c = input.next().charAt(0);

        int i, index = -1;
        for(i=0; i<str.length(); i++){
            if(str.charAt(i) == c)
                index = i;
        }

        System.out.println("Sample output for values " +str+ " and " +c);
        System.out.println("Last occurrence of character " +c+ " in " +str+ " is at index " +index);
    }
}
