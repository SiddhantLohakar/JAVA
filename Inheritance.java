public class Inheritance {
    public static void main(String[] args) {
        EngineeringStudent s1 = new EngineeringStudent();
        s1.markAttendance();
        s1.attendLab();
    }
}


class Student{
    String name;
    int age;

    void markAttendance(){
        System.out.println("Attendance marked");
    }
}

class EngineeringStudent extends Student{
    void attendLab(){
        System.out.println("Lab Attended");
    }
}
