public class Interface {
    public static void main(String[] args) {
        
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