public class Overloading {
    public static void main(String[] args) {
        
    }

    static int sum(int a, int b){ // two parameters function
        return a + b;
    }

    static int sum(int a, int b, int c){ // three parameters function
        return a + b + c;
    }

    static int sum(int a, float b) // datatype of parameters changed
    {
        return (int) (a + b);
    }

    static int sum(float a, int b) // order of parameters changed with different datatype
    {
        return (int) (a + b);
    }
}
