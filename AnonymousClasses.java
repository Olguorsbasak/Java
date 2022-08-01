package MoreOnClasses;

public class AnonymousClasses {
	public void start() {
        System.out.println("Starting...");
    }
}

class Machine{
    public static void main(String[ ] args) {
        Machine machine = new Machine() {
            @Override 
            public void start() {
                System.out.println("Wooooo");
            }
        };
        machine.start();
    }
    
	public void start() {
		// TODO Auto-generated method stub
		
	}
}
