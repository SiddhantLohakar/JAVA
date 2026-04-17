public class TypeConversions {
    public static void main(String[] args) {
        // Widening conversion
        byte b = 44;
        char c = 'a';
        int i = b;
        System.out.println("Widening1 byte to int: " + b + " " + i);
        i = c;
        System.out.println("Widening2: char to int: " + c + " " + i);

        // Narrowing Conversion
        i = 300;
        b = (byte) i;
         System.out.println("Narrowing int to byte: " + i + " " + b);

        //  Truncating Conversion
        float f = 123.45f;
        i = (int) f;
        System.out.println("Truncating Conversion: " + f + " " + i);
    }
}
