import java.util.Objects;

public class Student implements Comparable<Student>{

    private String name;
    private String course;
    private Double grade;
    private String room;

    public Student(String name, String course, Double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
    public Student(String name, String course, Double grade, String room){
        this.name = name;
        this.course = course;
        this.grade = grade;
        this.room = room;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Student: " + name +  " - grade: " + grade;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", course='" + course + '\'' +
//                ", grade=" + grade +
//                ", room='" + room + '\'' +
//                '}';
//    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(course, student.course) && Objects.equals(grade, student.grade) && Objects.equals(room, student.room);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course, grade, room);
    }
}
