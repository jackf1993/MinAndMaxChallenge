/* author: Jack Farah
 * level: easy
 * description: simple program to find the max and min numbers entered by user.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 0;
        int smallest =0;
        int largest =0;
        boolean first = true;

        System.out.println("Enter Numbers: ");

        Scanner input = new Scanner(System.in);

        while(true){
             boolean isAnInt = input.hasNextInt();
            if(isAnInt){
                int in = input.nextInt();

                if (first) {
                    first = false;
                    smallest = in;
                    largest = in;
                }
                if (in < smallest) {
                    smallest = in;
                }
                if (in > largest) {
                    largest = in;
                }
            }
            else{
                break;
            }

        }
        System.out.println("Smallest Number Entered: "+ smallest +", and Largest Number Entered: "+ largest);

        input.close();
    }
}
