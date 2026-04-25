public class Strings {
    public static void main(String[] args) {
        // String s1 = "ja" + "va";    
        // String s2 = "java";

        // System.out.println(s1 == s2);

        // String s3 = "Hello";
        // String s4 = s3 + " World"; // This will be resolved during the runtime so this will be going in the normal heap memory
        // String s5 = "Hello World";
        // System.out.println(s4 == s5); // false because s5 is in String pool and s4 is in normal heap.

        // String s6 = "Hello";
        // String s7 = s6; // This is resolved at compile time. So both will be stored in String pool.
        // System.out.println(s6 == s7); // This will result in true.

        String s8 = new String("Hello");  // Hello will also be present in String pool as well as in heap
        String s9 = "Hello"; // This will directly  point to the "Hello" present in the String pool


    }
}
