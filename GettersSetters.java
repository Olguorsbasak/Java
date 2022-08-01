package ObjectOrientedProgramming;

public class GettersSetters {
private String color;
    
    // Getter
    public String getColor() {
        return color;
    }
    
    // Setter
    public void setColor(String color) {
        this.color = color;
    }
}

class Program {
    public static void main(String[ ] args) {
        GettersSetters vehicle = new GettersSetters();
        vehicle.setColor("Red");
        System.out.println(vehicle.getColor());
    }
}
