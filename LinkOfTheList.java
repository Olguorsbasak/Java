package Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkOfTheList {

/*The program you are given declares a LinkedList of integers, takes 5 numbers from user, and add them to it.
*Write a program to calculate and output the sum of them elements.

*Sample Input
*4
*3
*50
*3
*8

*Sample Output
*68

*Use Iterator and its methods to execute the calculation using the while loop.
*/
	public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);
        
        LinkedList<Integer> nums = new LinkedList<Integer>();
        
        while(nums.size()<5){
            int num = scanner.nextInt();
            nums.add(num);
        }
        
        
        int sum = 0;

            for(int s: nums){
            sum+=s;
        }
        scanner.close();
        
        System.out.println(sum);
    }
}
