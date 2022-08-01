package ObjectOrientedProgramming;

public class MethodReturn {

	static int sum(int val1, int val2) {
        return val1 + val2;
    }

	static int max(int a, int b) {
        if(a > b) {
          return a;
        }
        else {
            return b;
        }
	}   
    public static void main(String[ ] args) {
        int x = sum(2, 5);
        System.out.println(x);
        int res = max(7, 42);
        System.out.println(res);
    }
    
}
