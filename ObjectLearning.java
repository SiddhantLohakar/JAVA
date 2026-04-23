public class ObjectLearning {
    public static void main(String[] args) throws CloneNotSupportedException {

        //  toString() method
        Student s1 = new Student();
        System.out.println(s1.toString());  //  even if we don't write toString, it is internally implemented by the println.

        // equals method
        Student s2 = new Student();
        System.out.println(s1.equals(s2));

        // Afer overriding equals method
        s1.name = "Siddhant";
        s1.age = 22;
        s2.name = "Siddhant";
        s2.age = 22;

        System.out.println(s1.equals(s2)); 

        // getClass() method
        System.out.println(s1.getClass().getName());

        //instanceOf operator
        // System.out.println(s1 instanceof Student);
        System.out.println(s1 instanceof Object);

        
        // clone method
        Student s3 = new Student();
        s3 = (Student) s1.clone();
        System.out.println(s3.name);
    }
}

class Student implements Cloneable {
    String name;
    int age;

    @Override
    public boolean equals(Object obj){

        if(obj == null)
            return false;

        // Check if both classes are of type Student
        // If not checked -> ClassCastException
        if(obj.getClass() != this.getClass())
            return false;

        Student s = (Student) obj;

        return (this.name == s.name  && this.age == s.age);
    }
    

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
