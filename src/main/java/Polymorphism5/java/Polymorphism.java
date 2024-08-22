package Polymorphism5.java;

import Inheritance5.Child;

public class Polymorphism {
    public static void main(String[] args) {
        //  POLLY MORPHISM has many forms
        //  There are 2 types of polymorphism =
        //  Type 1 compile-time polymorphism or method over loading=
        // -> method name should same
        // -> different number of parameters if the same datatype
        // -> wih the same class
        //  Type 2: Run-time polymorphism or method over riding:
        //  -> overriding happens when we have to classes having inheritance
        // -> having same method name with different implementations
        //  ->  @Overriding is recommended to overcome java's confusion that it's overriding not overloading.
        //    OVER-LOADING EXAMPLE:
        //    MATHS Obj= new Maths();
        //  math obj= new math();
        //  obj.add
        // Child c1 = new Child();
        // c1. honk();
        //  over loading =
        //     create a subtract method with different parameters
        //  --------------------------------------------
        //    overriding =
        //    class animal -> parent -> method sound (anything)
        //                  I
        //                  v
        //    class dog -> child -> method sound (bow bow)
        //    class cat -> grandchild -> method sound (meow meow)

//      To create an object REMEMBER---->>>>>  class name object name = new class name();

        AnimalParent mon = new AnimalParent();
        mon.sound();

        CatGrandChild cleo = new CatGrandChild();
        cleo.sound();

        DogChild bark = new DogChild();
        bark.sound();
    }
}
