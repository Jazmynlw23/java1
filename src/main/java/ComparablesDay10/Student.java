package ComparablesDay10;

// Comparator VS. Comparable:

// Comparable:
//is an interface java.lang
// it is used to compare current object with another object.
// Single sorting
// Compare to()
//-----------------------------------------------------------------------------

// Comparator:
// is an interface java.util
//it used for comparing two or more objects
// Multiple sorting
//Compare()
//FOR EXAMPLE:

// implements Comparable<Student>
public class Student{
    private int id;
    private  String name;

    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //@Override
   // public int compareTo(Student other) {
    //    return this.id - other.id;
//    }

}
