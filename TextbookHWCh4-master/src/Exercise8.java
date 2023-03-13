/**
 * @Class: Exercise8
 * @author: Nazmun Nahar
 * @Course: ITEC 2140
 * @Version: 1.1
 * @Date: Mar 13, 2023
 * Description: this program will reverse a string
 */

import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.nextLine();
        String rev = "";
        char c;

        for(int i=0; i<str.length(); i++){
            c = str.charAt(i);
            rev = c+rev;
        }
        System.out.println("Sample output for values " +str+ " :");
        System.out.println("Reverse of " +str+ " is " +rev);
    }
}
