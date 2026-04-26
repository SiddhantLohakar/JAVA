public class Generics {
    public static void main(String[] args) {
        Box<Integer> b = new Box<>(10);
        System.out.println(b.getValue());

        System.out.println(getResult(5));
    }

    public static <T> T getResult(T x){
            return x;
    }

    public static <T extends Number, U extends Number> double add(T a, U b) {
    return a.doubleValue() + b.doubleValue();
    }

    
}


class Box<T>{
    T value;

    Box(T value){
        this.value = value;
    }

    T getValue(){
        return this.value;
    }
}