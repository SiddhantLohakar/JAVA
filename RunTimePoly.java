public class RunTimePoly {
    public static void main(String[] args) {
        // Car c = new EVCar();
        // c.StartCar(); // This will give error
        /*
                Private methods:

                Are not inherited
                Cannot participate in runtime polymorphism
                Are resolved at compile time only
        
        */
    }
}

class Car {
    // private void StartCar(){
    //     System.out.println("Car is starting");
    // }

    static void StartCar(){  // Now this method cannot be overriden inside the base class and will give the error
        System.out.println("Car is starting");
    }

    final void StopCar(){ // This method cannot be oveeriden also.
        System.out.println("Car is stopping");
    }
}

class EVCar extends Car{
    // void StartCar(){
    //     System.out.println("Starting EV car");
    // }

    // void StopCar(){

    // }
}