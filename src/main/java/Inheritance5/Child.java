package Inheritance5;

public class Child extends Parent {
    @Override
    public void greet() {
        super.greet();
    }

    public static void main(String[] args) {
        Child c5 = new Child();
        c5.greet();
    }
}

