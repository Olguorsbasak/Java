package ConditionalsAndLoops;
import java.util.Scanner;
public class EmotionDetector {

	public static void main(String[] args) {
/*Your robot can recognize your emotions 
 * marked with number that represents each 
 * of them:
*1 - You are happy!
*2 - You are sad!
*3 - You are angry!
*4 - You are surprised!
*Write a program that takes the emotion 
*number as input and outputs the
* corresponding message in given format.
*If the input is an emotion that the program
*doesn’t know, it should output: 
*"Unknown emotion.".

*Sample input
*1

*Sample output
*You are happy!

*Don't forget about the break statement.
 * 		
 */
		
		Scanner scanner = new Scanner(System.in);
	       int emotion = scanner.nextInt();
	       switch (emotion){
	           case 1:
	           System.out.println("You are happy!");
	           break;
	           case 2: 
	           System.out.println("You are sad!");
	           break;
	           case 3: 
	           System.out.println("You are angry!");
	           break;
	           case 4: 
	           System.out.println("You are surprised!");
	           break;
	           default:
	           System.out.println("Unknown emotion.");
	       }
	       scanner.close();
	}

}
