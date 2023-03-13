/**
 * @Class: Exercise5
 * @author: Nazmun Nahar
 * @Course: ITEC 2140
 * @Version: 1.1
 * @Date: Mar 13, 2023
 * Description: this program will calculate the factorial of a number
 */

import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, fact=1;

        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        for(i=2; i<=n; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of the number " +n+ " is " +fact);
    }
}
