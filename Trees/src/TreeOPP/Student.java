package TreeOOP;
public class Student {
    String id;
    String name;
    String gpa;

    public Student(String id, String name, String gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", gpa=" + gpa + '}';
    }
    
}
