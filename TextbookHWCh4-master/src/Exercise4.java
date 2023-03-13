/**
 * @Class: Exercise4
 * @author: Nazmun Nahar
 * @Course: ITEC 2140
 * @Version: 1.1
 * @Date: Mar 13, 2023
 * Description: this program will calculate the first 30 fibonacci series numbers
 */

import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        int a = 0, b = 1, c, i = 0;
        System.out.print("The first " + n + " terms of the Fibonacci sequence are: ");
        while (i < n) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        input.close();
    }
}
