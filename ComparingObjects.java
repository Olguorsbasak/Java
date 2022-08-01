package MoreOnClasses;

public class ComparingObjects {
	String name;
    ComparingObjects(String n) {
        name = n;
    }
}

class MyClass {
    public static void main(String[ ] args) {
    	ComparingObjects a1 = new ComparingObjects("Robby");
    	ComparingObjects a2 = new ComparingObjects("Robby");
       // System.out.println(a1 == a2);
    	System.out.println(a1.equals(a2));
    }
}
