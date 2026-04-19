public class OOP {

    

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Siddhant Lohakar";
        s.age = 23;
        s.rollNumber = 64;

        s.print();
    }


}

class Student{
    
        // Data members
        String name;
        int age;
        int rollNumber;

        void print()
        {
            System.out.println("Name of Student: " +  name);
            System.out.println("Age of Student: " +  age);
            System.out.println("Roll Number of Student: " +  rollNumber);
        }
        
    }
