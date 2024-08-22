package Genericsday8.com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetIntro<I extends Number> {
    public static void main(String[] args) {
        HashSet<Object> set1 = new HashSet<>();
        // can store null values
        set1.add(null);
        // does not follow the insertion order
        set1.add(54);
        set1.add(89);
        set1.add(21);
        set1.add(65);
        //does not allow duplicates
        set1.add(21);
        System.out.println(set1);

        set1.remove(54);
        System.out.println(set1);

        set1.clear();
        System.out.println(set1);

        Set <Integer> set2 = new LinkedHashSet<>();
        set2.add(10);
        set2.add(48);
        set2.add(30);
        set2.add(50);
        set2.add(10);
        System.out.println(set2);










    }
}
