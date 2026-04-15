public class DataTypes {
    public static void main(String[] args) {
        

        // Integers: byte, short, int, long
        byte b = 5;
        short s = 10;
        int i = 4000;
        long l = 10000;

        System.out.println("Integer Values --->" + b + " " + s + " " + i + " " +  l);

        // Real Numbers:
        float f = 10.54f;
        double  d = 10.33;
        System.out.println("Real Numbers --->" + f + " " + d);

        // Characters:
        char c = 'a';
        System.out.println("Characters --->" + c);

        // Boolean:
        boolean bool = false;
        System.out.println("Boolean --->" + bool);


        // How to write and store binary, hexadecimal and ocatal numbers
        // 1. Binary (0b):
        short bi = 0b101;
        System.out.println("Binary --> "+ bi);
        // 2. Octal (0)
        bi =  07;
        System.out.println("Octal ---> "+ bi);
        // 3. Hexadecimal (0x)
        bi = 0xA;
        System.out.println("Hexadecimal --->" + bi);
    }
}
