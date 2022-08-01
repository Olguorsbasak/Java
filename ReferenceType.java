package ObjectOrientedProgramming;

public class ReferenceType {

	public static void main(String[] args) {
		
		Person person = new Person() ;
       
        person.setAge(20);
        celebrateBirthday(person);
        System.out.println(person.getAge());
  }  
    
    static void celebrateBirthday(Person person2) {
        person2.setAge(person2.getAge() + 1);
    }


    public class Person {
    	
    	private String name;
    	private int age;
    
    	Person () {
        this.name = "John";
    	}
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int a) {
        this.age = a;
    }
}
}