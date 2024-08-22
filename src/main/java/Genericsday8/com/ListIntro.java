package Genericsday8.com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListIntro {
    public static void main(String[] args) {
 //  arraylist    datatype  variable/obj name = new arrayList<>():
        ArrayList <String>   names            = new ArrayList<>();
//   ArrayList:
//   --> it is a resizable array
//   --> Good for adding something
//   --> it is not good inserting or deleting
 //  Functions: used to add something...adding functions
     names.add("Terri");
     names.add("White");
     names.add(0,"hi");
        System.out.println(names);
 //  or you can print out other functions like...
        System.out.println(names.size());
        System.out.println(names.contains("Terri"));
        System.out.println(names.indexOf("White"));
 //-------------------------------------------------------------------------
 //   LinkedList:
 //   --> a sequence of elements where each element is pointing to the next (in a chain).
 //   --> good for inserting or deleting elements in muddle of the list.
 //   --> they have nodes -> each node will know its own and the fellow elements location.
        LinkedList<String> Students = new LinkedList<>();
        Students.addFirst("Sydnee");
        Students.addLast("Reed");
        Students.add(String.valueOf(15));
        System.out.println();

    }


}
