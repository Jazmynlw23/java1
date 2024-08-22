package Inheritance5.blit;

public class Day5 {
    public static void main(String[] args) {
     //parent class name  child name
        Car               Toyota = new Car();
     // Here is where you set the names of your strings crated in the other folder you're working from.
        Toyota.setColor("red");
        Toyota.setDoors(4);
        Toyota.setMiles(20.2);
        Toyota.setName("Rav4");
     // after you are finished and you create your printouts and accessing your getters.
        System.out.println(Toyota.getName());
        System.out.println(Toyota.getColor());
        System.out.println();
        System.out.println();


        Terri c = new Terri();
        c.setName("terri");
        c.setAge("45");
        c.setGender("female");
        c.setHeight("5.2");
        c.setEthnicity("black");
        c.setWeight(String.valueOf(160));


    }
}
