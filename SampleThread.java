package ExceptionsListsThreadsFiles;

public class SampleThread extends Thread {
	public void run() {
        System.out.println("Hello");
    }

    public static void main(String[ ] args) {
       SampleThread obj = new SampleThread();
        obj.start();
  
}
}
