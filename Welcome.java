package ExceptionsListsThreadsFiles;

public class Welcome {

/*We are writing a registration program for our app. At first it should welcome the users, then ask the users to enter their names.
*But program you are given executes this sequence in reverse order.
*Complete the program by extending the Thread class for Welcome and Name classes, then setting priorities for their run methods so that the program outputs the messages in the correct order.

*Use setPriority(number) method on the objects - obj.setPriority(number). The higher the number, the higher the priority.
*/
	
	 public static void main(String[ ] args) {
	        Name name = new Name();
	        name.setPriority(1);
	       
	        Welcome welcome = new Welcome();
	        welcome.setPriority(6);
	        
	        welcome.start();
	        name.start();
	       
	    }

	private void start() {
		// TODO Auto-generated method stub
		
	}

	private void setPriority(int i) {
	// TODO Auto-generated method stub
	
}

	class Welcome extends Thread{
	    public void run() {
	        System.out.println("Welcome!");
	    }
	}

	class Name extends Thread{
	    public void run() {
	        System.out.println("Please enter your name");
	    }
}
}