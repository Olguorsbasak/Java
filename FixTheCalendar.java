package Arrays;

public class FixTheCalendar {
/*Your calendar program should 
 * output all the days of week, 
 * but it has errors.
*Change the code so that the program 
*prints the days.
*Notice that we use an array literal 
*because we already know all the elements 
*of the array we are going to create.

 */
	public static void main(String[] args) {
	       String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

	       for (int i = 0; i < 7; i++) {
	           System.out.println(days[i]);
	       }
	
}
}
