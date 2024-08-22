package ThreadDay7;

public class ExceptionsIntro {
    // ERRORS:
    // SOMETHING THAT YOU NEED TO RESOLVE IN ORDER TO RUN JAVA PROGRAMS:
    // EXAMPLE: Syntaxerror, outofmemory

    // EXCEPTION:
    // EXCEPTIOns are some kind of errors hat can be resolved by trying to catch blocks
    // example: arthemathiceception, arrayndexoutobownfexception.
    // handling the exceptions:
    // it will try a bunch of code.
    // try {

    // }catch()
    // catch will try seeing in its block.

    // Finally Block
    //  It is a block that will print anyway.

    // CHECKED:
    // --> at compile time
    // --> use keyword throw
    // --> handled using try/catch block

    // Un-Checked:
    // --> not checked at compile time
    // --> comes at run-time
    // --> uses keyword throws

    // Throw: manually throw an exception
    // Throws: in a method to specify that which exception the method
    public static void main(String[] args) {

        try {
            int a =10;
            int b= 0;
            int result = a/b;
            System.out.println();
        }catch (ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        System.out.println("hello this is world");

        String[] names = {"Terri", "white"};
        try {
            names[2].toUpperCase();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("hello this is me");
    }
}
