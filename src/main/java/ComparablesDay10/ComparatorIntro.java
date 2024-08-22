package ComparablesDay10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorIntro {
    public static void main(String[] args) {
        List<Student> s1 = new ArrayList<>();
        s1.add(new Student(102, "Alice"));
        s1.add(new Student(425, "bob"));
        s1.add(new Student(225, "John"));
        s1.add(new Student(520,"Louis"));

        Collections.sort(s1,new IdComparator());
        System.out.println(s1);

        for (Student ss1: s1){
            System.out.println(ss1.getId() + ss1.getName());
        }

    }
}
