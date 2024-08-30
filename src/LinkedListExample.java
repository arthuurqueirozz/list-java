import java.util.List;
import java.util.LinkedList;

public class LinkedListExample<S> {
    public static void main (String args[]) {
        linkedExample();
    }

    private static void linkedExample() {
        System.out.println("LINKED LIST: ");
        List<String> linkedList = new LinkedList<String>();  // Usa java.util.LinkedList
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        System.out.println(linkedList);
    }
}
