import java.io.*;

public class BufferReader {
   public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        String name = br.readLine();
        System.out.println(name);


   } 
}
