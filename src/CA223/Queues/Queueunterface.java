package CA223.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queueunterface {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Ahmed");
        queue.add("Omar");
        queue.add("mohamed");

        System.out.println("removed element: " + queue.remove());
        System.out.println("removed element: " + queue.poll());

        System.out.println("Queue elements: " + queue);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Front element: " + queue.element());

        System.out.println("size  : "  + queue.size());
        System.out.println("isEmpty  : "  + queue.isEmpty());
    }
}
