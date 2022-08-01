package Arrays;

public class Matrix {

/*You are given a 3x3 matrix with numbers:
* 
* 
*int[][] matrix = {
   * {8, 1, 6},
   * {3, 5, 7},
   * {4, 9, 0},
*} 

*Output the numbers of the
**array, each on a new line.
*Hint: You need to use two nested
*for loops to iterate over the array.
*/
	public static void main(String[] args) {
	       int[][] matrix = {
	               {8, 1, 6},
	               {3, 5, 7},
	               {4, 9, 0},
	       };
	       
	            for (int i=0;i<3;i++){
	                for(int j=0;j<3;j++){
	                    System.out.println(matrix [i][j]);
	                }
	            }
}
}
