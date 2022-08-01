package ObjectOrientedProgramming;

public class Constructor {
private String color;
    
    Constructor() {
        this.setColor("Red");
    }
    Constructor(String c) {
        this.setColor(c);
    }
    
    // Setter
    public void setColor(String c) {
        this.color = c;
    }
    
    // Getter
    public String getColor() {
        return color;
    }



    public static void main(String[] args) {        
        //color will be "Red"
        @SuppressWarnings("unused")
		Constructor v1 = new Constructor();
        
        //color will be "Green"
       Constructor v2 = new Constructor("Green"); 
        
        System.out.println(v2.getColor());
    }

}