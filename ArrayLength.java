package Arrays;

public class ArrayLength {
	public static void main(String[] args) {
        int[ ] intArr = new int[5];
        System.out.println(intArr.length);
        
        int [ ] myArr = {6, 42, 3, 7};
        int sum=0;
        for(int x=0; x<myArr.length; x++) {
            sum += myArr[x];
        }
        System.out.println(sum);
    }
}
