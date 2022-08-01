package ExceptionsListsThreadsFiles;

public class SampleThread2 implements Runnable {
	public void run() {
        System.out.println("Hello");
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Thread t = new Thread(new SampleThread2());
        t.start();
    }
	
}
