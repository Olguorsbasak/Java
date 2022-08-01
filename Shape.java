package MoreOnClasses;

import java.util.Scanner;
public abstract class Shape {
	int width;
    abstract void area();
}
//your code goes here
class Square extends Shape {
	Square (int x){
	  this.width = x ;  
	}

	@Override
	void area() {
System.out.println(width*width);	}
}
class Circle extends Shape {
	Circle (int y)
	{
	   this.width = y ;	
	}

	@Override
	void area() {
System.out.println(Math.PI*width*width);	  }


    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
        sc.close();
    }
    }

