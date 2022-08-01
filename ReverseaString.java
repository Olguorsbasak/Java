package Arrays;

import java.util.Scanner;
public class ReverseaString {

	public static void main(String[] args) {
/*Reverse a String

*Write a program to take a string as input 
*and output its reverse.
*The given code takes a string as input and 
*converts it into a char array, which contains 
*letters of the string as its elements. 

*Sample Input:
*hello there

*Sample Output: 
*ereht olleh 
*You can loop through the char array, starting 
*from the end, using arr.length to get the size 
*of the array.
*/
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		//your code goes here
		int x = arr.length;
		for(int i=x-1; i>=0 ;i--){
			System.out.println(arr [i]);
		}
		scanner.close();
	}

}
