public class UpcastingDowncasting {
    public static void main(String[] args) {
        // Upcasting
        String s = "Hello";
        Object obj = s;

        System.out.println(obj);

        // Downcasting
        Object obj2 = "Siddhant";
        String s2 = (String)obj2;
        System.out.println(s2);
    }
}


