/**
 * @Class: Exercise2
 * @author: Nazmun Nahar
 * @Course: ITEC 2140
 * @Version: 1.1
 * @Date: Feb 27, 2023
 * Description: this program will calculate the average of the numbers
 */

import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        float sum = 0, n=0;
        float avg = 0.0f;

        System.out.print("Enter an integer: ");
        System.out.println();
        while (keyboard.hasNextInt()){
            int input= keyboard.nextInt();
            sum = sum + input;
            n++;
        }

        avg = (float) (sum/n);
        System.out.println(avg);
    }
}
