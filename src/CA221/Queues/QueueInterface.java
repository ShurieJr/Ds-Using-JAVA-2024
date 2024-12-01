package CA221.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        //object
        Queue<Integer> queue = new LinkedList<>();

        queue.add(100);
        queue.add(200);
        queue.add(300);
        queue.add(400);
//        queue.offer(200);
//        queue.offer(300);

        queue.remove();
        queue.poll();


        System.out.println("Elements: " + queue);
        System.out.println("front: " + queue.peek());  // null
        System.out.println("front: " + queue.element());  // excepton
    }
}
