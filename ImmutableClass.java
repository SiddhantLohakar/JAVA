public class ImmutableClass {
    public static void main(String[] args) {
        
    }
}

final class Student {
    final private int age;
    final private  String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    int getAge(){
        return this.age;
    }

    String getName(){
        return this.name;
    }
}

