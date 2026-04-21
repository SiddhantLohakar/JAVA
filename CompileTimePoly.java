public class CompileTimePoly {
    public static void main(String[] args) {
        Add a = new Add();
        System.out.println(a.sum(3, 4));
    }
}

class Add{
    int sum(int a, int b){ // two parameters function
        return a + b;
    }

    int sum(int a, int b, int c){ // three parameters function
        return a + b + c;
    }

    int sum(int a, float b) // datatype of parameters changed
    {
        return (int) (a + b);
    }

   int sum(float a, int b) // order of parameters changed with different datatype
    {
        return (int) (a + b);
    }
}
