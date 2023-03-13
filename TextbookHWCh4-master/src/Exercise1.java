/**
 * @Class: Exercise1
 * @author: Nazmun Nahar
 * @Course: ITEC 2140
 * @Version: 1.1
 * @Date: Feb 27, 2023
 * Description: this program will check the number whether it is prime or not
*/

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, flag=0;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        for(int i=2; i<=num/2; i++){
            if(num%i == 0){
                flag = 1;
            }
        }

        System.out.printf("Sample output for value of %d:", num);
        System.out.println();
        if(flag == 0){
            System.out.printf("%d is a prime number", num);
        }
        else
            System.out.printf("%d is not a prime number", num);
    }
}
