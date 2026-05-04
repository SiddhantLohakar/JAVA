import java.util.*;

public class TreeSetLearning{
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(30);
        set.add(40);
        set.add(10);
        set.add(20);

        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.headSet(30)); // Returns number strictly lesser than 30
        System.out.println(set.tailSet(30)); // Returns number greater than or equal 30
        // System.out.println(set.subSet(10, 50));

        System.out.println(set.lower(20)); // Largest  number smaller than 20
    }
}