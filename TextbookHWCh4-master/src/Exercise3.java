/**
 * @Class: Exercise3
 * @author: Nazmun Nahar
 * @Course: ITEC 2140
 * @Version: 1.1
 * @Date: Mar 13, 2023
 * Description: this program will check highest and lowest of the given numbers
 */

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        int h = -1, l = 101;

        System.out.print("Enter an integer: ");
        System.out.println();
        while (key.hasNextInt()){
            int input= key.nextInt();

            if(input > h)
                h = input;

            if(input < l)
                l = input;
        }

        System.out.println("Highest student grade is " + h);
        System.out.println("Lowest student grade is " + l);
    }
}
