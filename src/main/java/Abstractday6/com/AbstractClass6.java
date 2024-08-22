package Abstractday6.com;

import java.sql.SQLOutput;

public class AbstractClass6 {
 //   Abstraction:
 //    it's a process of hiding the certain details and implementations.
 //    it's achieved by 2 ways:
 //   -Abstract class:
 //   - can have concrete and abstract methods
 //   - cannot create objects using abstract class

 // Abstract methods:
 // -Those methods who dont have a body

    public static void main(String[] args) {
        // Bankaccount b= new Bamkaccount();

        // Interface:
        // -we use keyword  = implements
        // we cannot create objects using interface
        // when a class implements an interface, that class should implement its methods.
        // interface can have abstact methods only.

        // in interface -> methods --> by default its public, attributes are  -> static and final.
        // by using interface we can implement multiple inheritance.
        // JAVA DOES NOT ALLOW MULTIPLE INHERITANCE WITH CLASS
        // A CLASS SHOULD ONLY HAVE ONE PARENT
        // IN ABSTRACTS CONCEPT YOU CAN PULL MULTIPLE
        // A CLASS SHOULD ONLY EXTEND ONE PARENT


  //-------------------------------------------------------------
  //   JDK: JAVA DEVELOPMENT KIT = HELPS US WRITE THE CODE.
  //   JRE: JAVA RUNTIME ENVIRONMENT = HELPS US RUN THE CODE / AL THE LIBRARIES
  //   JVM:
  //   -JAVA VIRTUAL MACHINE=
  //    -> JAVAC-> JAVA COMPILER= COMPILES THE SOURCE CODE INTO MACHINE CODE
  //    -> JIT -> JUST IN TIME = IT READS CODE LINE BY LINE AND UNDERSTANDS WHAT USER WANTS AS AN OUTPUT
  //    -> WORA: WRITE ONCE RUN ANYWHERE: which means once we write java cde it can be ran on any computer having JVM (Java
  // Virtual Machine)

        // JAVA MEMORY:
//--------------------------------
        // STACK:
        // - JAVA uses stack memory to store local variables and method calls.
        // - METHOD  call means when you call a variable using method.

  //   --> HEAP:
  //        - JAVA OBJECTS will be stored in heap. portion of memory storing objects and arrays
  //  --> String Class:
  //      -Strings are final (immutable means can't be change) -> once created its vales cannot be changed.
        // Examples:
    // These are variables:
    String a = "hey";
    String b= new String();

    String s1 = "hello world";
    String s2 = "hello world";

    String c = "hey";
    c = "hi";
    String s3 = "helo world";
    String s4 = new String("hello world");

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3==s4);
      // Concatenations:
        System.out.println("hey" + " " + "are" + " " + "you");

      // Final:
      // In JAVA: the final keyword is used to apply restrictions on classes, methods, and variables.
      // In CLASS: making final means it cannot extend.
    }
}
