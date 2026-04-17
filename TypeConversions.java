public class TypeConversions {
    public static void main(String[] args) {
        // Widening conversion
        byte b = 44;
        char c = 'a';
        int i = b;
        System.out.println("Widening1 byte to int: " + b + " " + i);
        i = c;
        System.out.println("Widening2: char to int: " + c + " " + i);
    }
}
