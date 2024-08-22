package Genericsday8.com;

public class Day8notes {


    // Generics will not be used while coding, but first created when Java was first programed. Since then other program
    //   concepts have been created. Such as Arrays and so on.

    // Garbage Collector:
    // it comes announced and take the data that is not being used we can not force it.
    // Final:
    // classes/methods/variables that cannot change. They cannot be inherited.
    // Finalize:
    // a method that runs before an object is removed from garbage for cleanup and removing files.
    // Finally:
    // The last block of code after try catch. "Finally" will execute no matter if the try catch works or not.
    //When using Generics you have to write out the primitive data types in uppercase letters such as:
    // int= Integers, double=Double, float = Float and so on.
    // Wrapper classes: int is getting wrapped from a primitive datatype to a object now..
    // Collection Framework: Created to upgrade from using Generics, however these things are still deeply rooted using
    // Generics concept.
    // Collection Frameworks are the following:
    // ---> Arrays: were fixed in size..
    //----> List --> ArrayList, Linkedlist, Stack.
    //----> Set -->  Hashset, Linkedhash set
    //----> SortedSet --> Queve, PriorityQueve, DoubleEndedQueve
    //----> MAP --> HashMAP, LinkedMAP, TreeMAP

    //   hashset:                                     Linkset:                  Treeset:
//   can store null values                       can store null values       Can not store null values
//   does not follow insertion orderTreeset:     follows insertion order     Follows sorting order
//  All items are unique  -> every data has its uniquw name in memory
// set has all the values given a specific id of a hashcode in their memory thats wh we cannot have duplicates

//----------------------------------------------------------------------------------------------------------------------
//  This code below is created to call the code from the Generics.java class.
    public static void main(String[] args) {
        Generics obj = new Generics();
        obj.shout("Hey", 56);
        obj.shout(3456, 45.00);
        obj.shout(45.00, "hey");
    }
}