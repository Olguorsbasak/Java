package MoreOnClasses;

public class InnerClasses {
	int id;
    InnerClasses(int i) {
        id = i;
        Brain brain = new Brain();
        brain.think();
    }

    private class Brain {
        public void think() {
            System.out.println(id + " is thinking");
        }
    }



    public static void main(String[] args) {
        InnerClasses robot = new InnerClasses(1);
    }
}
