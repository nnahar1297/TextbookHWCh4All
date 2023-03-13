/**
 * @Class: Exercise10
 * @author: Nazmun Nahar
 * @Course: ITEC 2140
 * @Version: 1.1
 * @Date: Mar 13, 2023
 * Description: this program will print a pattern
 */

public class Exercise10 {
    public static void main(String[] args) {

        for(int row = 0; row < 5; row++ ){
            for(int column = 1; column <= 5 - row; column++ ){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
