/**
 * @Class: Exercise6
 * @author: Nazmun Nahar
 * @Course: ITEC 2140
 * @Version: 1.1
 * @Date: Feb 27, 2023
 * Description: this program will do the sum of the digits
 */

import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, mNum, digitSum=0;

        num = input.nextInt();
        mNum = num;

        while(num>0){
            digitSum = digitSum + num%10;
            num = num/10;
        }

        System.out.printf("Sample output for value %d:", mNum);
        System.out.println();
        System.out.printf("Sum of digits of %d is %d", mNum, digitSum);
    }
}
