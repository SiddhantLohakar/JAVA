import java.util.*;

public class SetLearning {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(5);
        set.add(8);

        System.out.println(set.contains(2));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Siddhant");
        map.put(2, "Lokesh");

        System.out.println(map.get(2));
    }
}
