package MoreOnClasses;

import java.util.Scanner;
public class Encapsulation {

/*You need a program to manage admissions for an art school. Pupils can be admitted to the school if they are over 6 years of age.
*You're given a program which declares a Pupil class.

*Task
*Complete the setAge method of the Pupil class. If the value of parameter a is over 6, assign it to age attribute and output "Welcome". 
*Output "Sorry" otherwise.

*Sample Input
*7

*Sample Output
*Welcome

*Use an if statement to check the mentioned condition.

*/
	public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
	    System.out.println("Please enter an age: ");
	    int a = read.nextInt();
	    
	    Pupil pupil =  new Pupil();
            pupil.setAge(a);
            read.close();
	}

}
class Pupil{
    private int age;
    
    //complete setter method
    public void  setAge(int a){
    if(a>6){
        age=6;
        System.out.println("Welcome");
    }else{
        System.out.println("Sorry");
    }

    }
    
    public int getAge(){
        return age;
    }
	
}
