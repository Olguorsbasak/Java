package ConditionalsAndLoops;
import java.util.Scanner;
public class UniversityAdmission {

	public static void main(String[] args) {
/*You are given code that takes the number 
 * of students who enter the university as input. 
 * Let's greet them!

*Task
*Complete the program to output "Welcome" for 
*each student.

*Sample Input
*2

*Sample Output
*Welcome
*Welcome

*Remember the semicolon (;) after initialization 
*and condition in the syntax.

 */
		
		
		Scanner scanner = new Scanner(System.in);
	       int n = scanner.nextInt();  
	      for(int x=1; x<=n; x++){
	          System.out.println("Welcome");
	      }
	      scanner.close();
	      
	}

}
