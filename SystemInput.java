import java.io.IOException;

public class SystemInput {
    public static void main(String[] args) throws IOException {
        int c = System.in.read();
        // System.out.println(c); // This will give integer value
        System.out.println((char) c);
    }
}
