import java.util.ArrayList;
import java.util.List;

public class Generics2 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        fun(dogs);  //This is not allowed because the  functiion is accepting a list of animals.
    }

    // static void fun(List<Animal> animals){
    //     for(Animal animal : animals){
    //         animal.eat();
    //     }
    // }


    // Limited functionalities without bound
//     static void fun(List<?> values){
//     for(Object obj : values){
//         System.out.println(obj.getClass().getName());
//     }
// }



         static void fun(List<? extends Animal> values){
            for(Animal a : values){
                a.eat();
                
            }
        }
}




class Animal {
    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}
