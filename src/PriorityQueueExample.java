import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueE {
    public static void main(String args[]) {
        Queue<String> queue = new PriorityQueue<String>();
        queue.add("short");
        queue.add("short indeed");

        while(!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
