package MoreOnClasses;
import java.util.Scanner;
public class ComputerSpeaking {
/*Computers understand only numbers, so every character has a numeric representation.
*The program you are given takes a character as input. Write a program to output its numeric value.

*Sample Input
*a

*Sample Output
*97
*Use cast to assign value of character to an integer.
 */
	public static void main(String[] args) {
	       Scanner read = new Scanner(System.in);
	       char a = read.next().charAt(0);
	       
	    
	       int b=(int) a;
	       System.out.println(b);
	       read.close();
	    }   
	
	
}
