package Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class PlayingKeepAwayWith3 {
/*The program you are given declares an even nums ArrayList.
*Write a program to take numbers as input and add them an ArrayList while the size of the ArrayList isn't equal to 3.
*Then calculate and output the average of all values in integers.

*Sample Input
*5
*2
*4
*
*Sample Output
*3

*Use evennums.size() in while loop condition.
*
*/
	public static void main(String[ ] args) {
	    Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> evennums = new ArrayList<Integer>();
         int sum=0;
        while(evennums.size()<3){
           
            int num = scanner.nextInt();
            evennums.add(num);
            sum+=num;
            
        }
        System.out.print(sum/3);
        scanner.close();
    }
	
}
