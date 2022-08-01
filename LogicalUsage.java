package ConditionalsAndLoops;

public class LogicalUsage {

	public static void main(String[] args) {
		int age = 22;
        int money = 800;
        
        if (age > 18) {
            if (money > 500) {
                System.out.println("Welcome!");
            }
        }
       
        
        if (age > 18 && money > 500) {
            System.out.println("Welcome!");
        }
	}

}
