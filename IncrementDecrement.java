package BasicConcept;
import java.util.Scanner;
public class IncrementDecrement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	       //taking initial score
	       int initScore = scanner.nextInt();
	       int scoreTom = initScore;
	       int scoreBob = initScore;
	       
	       System.out.println("Round 1 results:");
	       //fix
	       System.out.println(++scoreTom);
	       System.out.println(--scoreBob);
	       scanner.close();
	   }

	}


