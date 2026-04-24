public class Interface {
    public static void main(String[] args) {
        C c = new C();
        c.fun();

        // Giving priority to the functionn fun present inside the class
        D d = new D();
        d.fun();
    }
}

interface Car {
    void start();
    void applyBrake();
}

class ElectricCar implements Car{
    public void start(){
        System.out.println("Start the car");
    }

    public void applyBrake(){
        System.out.println("Stopping the ec car");
    }
}

// Multiple inheritance using JAVA
interface A{
   default void fun(){
        System.out.println("Inside class A");
    }
}

interface B{
    default void fun(){
        System.out.println("Inside class B");
    }
}

class E{
    public void fun(){
        System.out.println("Hello from E");
    }
}

class C implements A, B{
    // JAVA makes it compulsory to implement the fun method.
    public void fun(){
        B.super.fun();
    }
}

class D extends E implements A,B{

}