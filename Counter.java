package ObjectOrientedProgramming;

public class Counter {
	public static int COUNT=0;
    Counter() {
        COUNT++;
    }


public class CounterProgram{
    public static void main(String[ ] args) {
        @SuppressWarnings("unused")
		Counter c1 = new Counter();
        @SuppressWarnings("unused")
		Counter c2 = new Counter();
        System.out.println(Counter.COUNT);
    }
}
}