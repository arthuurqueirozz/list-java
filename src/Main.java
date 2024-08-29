import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String args[]){
        //List<String> list = listExemplo();
        //sortList(list);

        List<Student> Students = new ArrayList<Student>();

        Student a = new Student("putin",  "linux", 8.0);
        Students.add(a);
        Student b = new Student("maradona",  "windows", 8.2);
        Students.add(b);
        System.out.println(Students);
    }

    public static List<String> listExemplo() {
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