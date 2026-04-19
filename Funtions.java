public class Funtions{
    public static void main(String[] args) {
        int a = 2, b = 3;

        greet();
        sayHello("Siddhant Lohakar");
        int c = getNumber();
        System.out.println(c);
        int mul = multiply(a, b);
        System.out.println(mul);
    }


    // No Input No output
    static void greet(){
        System.out.println("Hello No Input No output");
    }

    // Input but no Output
    static void sayHello(String name){
        System.out.println("Hello" + name);
    }

    // No input but gives output
    static int getNumber(){
        return 10;
    }

    // Both Inpht and Output
    static int multiply(int a, int b){
        return (a * b);
    }
}   