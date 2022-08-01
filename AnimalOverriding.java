package MoreOnClasses;

public class AnimalOverriding {
	public void makeSound() {
        System.out.println("Grr...");
    }
}
class Cat extends AnimalOverriding {
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Program {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
    }
}
