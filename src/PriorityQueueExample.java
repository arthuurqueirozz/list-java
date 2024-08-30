import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String args[]) {
        Queue<String> queue = new PriorityQueue<String>();
        queue.add("short");
        queue.add("short indeed");
        queue.add("long");
        queue.add("long indeed");
        System.out.println(queue.size());

        while(!queue.isEmpty()) {
            System.out.println(queue.remove());
            System.out.println(queue.size());
        }
    }
}
