import java.util.*;

public class ComparableInterface {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Siddhant" , 90));
        list.add(new Student("Lokesh", 60));

        Collections.sort(list);

        for(Student s : list){
            System.out.println(s.name + " , " + s.marks);
        }
    }
}

class Student implements Comparable<Student>{
    String name;
    int marks;

    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other){
        return this.marks - other.marks;
    }
}

// this.marks - other.marks
// < 0 : this.marks, other.marks
// > 0 : other.marks, this.marks
