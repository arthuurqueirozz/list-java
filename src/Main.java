import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String args[]){
        //List<String> list = listExample();
        //sortList(list);

        List<Student> Students = new ArrayList<Student>();

        Student a = new Student("Vladimir Putin",  "linux", 8.0);
        Students.add(a);
        Student b = new Student("Loco Abreu",  "windows", 8.2);
        Students.add(b);
        Collections.sort(Students);
        System.out.println(Students);
    }

    public static List<String> listExample() {
        List<String> list = new ArrayList<String>();

        list.add("Joãozin");
        list.add("Pelé");
        list.add("Vladimir putin");
        list.add("eu");

        return list;
    }

    public static void sortList(List<String> list) {
        Collections.sort(list);
        System.out.println("SORTED LIST:");
        System.out.println(list);
    }
}