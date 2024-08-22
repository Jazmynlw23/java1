package Inheritance5.blit;
// how to create variables:
public class Car {
    private String name;
    private String color;
    private int doors;
    private double miles;
//after create getters and setters by clicking generate and click getter & setters.
    //These are also called methods.
 // Constructors: we create constructors according to our condition
    public Car() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
}
