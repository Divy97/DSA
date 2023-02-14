package queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dqueue01 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);

        System.out.println(deque);
    }
}
