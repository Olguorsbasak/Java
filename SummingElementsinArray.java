package Arrays;
import java.util.Scanner; 
public class SummingElementsinArray {

	public static void main(String[] args) {
/*You are given a program that takes the length
 *of the array as the first input, creates it, 
 *and then takes the next inputs as elements of 
 *the array.

*Complete the program to go through the array and 
*calculate the sum of the numbers that are
* multiples of 4.

*Sample Input
*5
*4
*9
*16
*2
*7

*Sample Output
*20
*To check if a number is a multiple of 4, 
*use the modulo operator % to divide it by
* 4 and check the remainder.
		 
*/
		 Scanner scanner = new Scanner(System.in);
	       int length = scanner.nextInt();
	       int[] array =  new int[length];
	       for (int i = 0; i < length; i++) {
	           array[i] = scanner.nextInt();
	       }

	        
	       int sum=0;
	       for (int i=0; i<length; i++){
	           if(array[i]%4==0){
	               sum=sum+array[i];
	            }

	       }
	       System.out.println(sum);
	       scanner.close();

	}

}
