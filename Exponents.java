package ObjectOrientedProgramming;
import java.util.Scanner;
public class Exponents {

	public static void main(String[] args) {
		
		       Scanner read = new Scanner(System.in);
		       int num1 = read.nextInt();
		       int num2 = read.nextInt();

		       double num3=Math.pow(num1,num2);
		       System.out.println(num3);
		       read.close();

}
}
