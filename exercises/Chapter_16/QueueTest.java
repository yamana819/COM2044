package exercises.Chapter_16;

import java.util.PriorityQueue;

public class QueueTest {
    public static void main(String[] args) {
        PriorityQueue<Double> queue = new PriorityQueue<>();
        queue.offer(3.9);
        queue.offer(21.3);
        queue.offer(122.3);
        while (queue.size()>0){
            System.out.println(queue.peek());
            queue.poll();
        }
    }
}
