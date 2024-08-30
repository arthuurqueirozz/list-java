import java.util.HashSet;
import java.util.Set;

public class HashExampleStudent {
    public static void main (String args[]) {
        Set<Student> group = new HashSet<Student>();

        Student a = new Student("john jones", "aviação", 6.76);
        Student b = new Student("denis rodman", "basketball", 6.9);
        Student c = new Student("bill cliton", "shooting", 3.76);
        Student d = new Student("bill cliton", "shooting", 9.76);


        group.add(a);
        group.add(b);
        group.add(c);
        group.add(d);

        for (Student student : group) {
            System.out.println(student);
        }

        System.out.println(group.contains(b));
    }
}
