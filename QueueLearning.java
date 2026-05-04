import java.util.*;

public class QueueLearning {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        // Single ended queue

        // enqueue
        queue.add(5); // Returns exception
        queue.offer(2); // Returns falls if unable to add
        queue.offer(3);

        System.out.println(queue.peek()); // returns null if no value is found
        System.out.println(queue.element());// element can throw exception if no value is found

        // removing element
        queue.remove(); // unsafe throws exception
        queue.poll(); // safe

        // addFirst() and addLast()
    }   
}
