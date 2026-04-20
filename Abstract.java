public class Abstract {
    public static void main(String[] args) {
        Car c = new ElectricCar();
        c.accelerate();
    }
}

abstract class Car{
    void start(){
        System.out.println("Starting the car");
    }

    abstract void accelerate();

    abstract void brake();
}


class ElectricCar extends Car {

    void accelerate(){
        System.out.println("Hello electric car is accelerating");
    }

    void brake(){
        System.out.println("Electric car is stopping");
    }
}