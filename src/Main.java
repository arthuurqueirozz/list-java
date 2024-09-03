import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String args[]){
        List<String> list = listExample();
        sortList(list);

        List<Student> Students = new ArrayList<Student>();

        Student a = new Student("Vladimir Putin",  "linux", 8.0);
        Students.add(a);
        Student b = new Student("Loco Abreu",  "windows", 9.6);
        Students.add(b);
        Student c = new Student("Kalashnikov",  "math", 9.2);
        Students.add(c);
        Collections.sort(Students);
        System.out.println("LIST SORTED BY NAME: ");
        System.out.println(Students);

        CompareGrade compareGrade = new CompareGrade();
        Collections.sort(Students, compareGrade);
        System.out.println("LIST SORTED BY GRADE: ");
        System.out.println(Students);
    }

    public static List<String> listExample() {
        List<String> list = new ArrayList<String>();

        list.add("João");
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