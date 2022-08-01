package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinumumMaximum {
/*The program you are given declares ArrayList of integers.
*Complete the program to take numbers as input and add them to ArrayList until its size isn't equal to 5. Then output its maximum and minimum values.

*Sample Input
*4
*12
*3
*88
*96

*Sample Output
*96
*3

*Use Collections.max() and Collections.min() to get the maximum and the minimum.
 
 */
	public static void main(String[ ] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        Scanner scanner = new Scanner(System.in);
        
        while(nums.size()<5){
            int num = scanner.nextInt();
            nums.add(num);
            
        }
        
        System.out.print(Collections.max(nums));
        System.out.print(Collections.min(nums));
        scanner.close();
    }
}
