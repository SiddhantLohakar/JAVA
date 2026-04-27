public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Siddhant";

        // System.out.println(s1.name + " " +  s1.age + " " + s1.rollNumber);

        //  Code for constructor chaining
    }
}

class Student{
    String name;
    int age;
    int rollNumber;

    // Basic Constructor
    // Student(){
    //     name = "I";
    //     age = 4;
    //     rollNumber = 5;
    // }

    // Constructor Chaining
    Student(){
        this("unknown");
    }

    Student(String name){
        this(name, 0);
    }

    Student(String name, int age){
       this(name, age, 0);
    }

    Student(String name, int age, int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }
}
