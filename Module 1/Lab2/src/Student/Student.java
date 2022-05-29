package Student;

public class Student {
    private String name;
    private final int id;
    static int counter = 0;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
        counter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ali", 1999);
        System.out.println(Student.counter);
        Student s2 = new Student("Mohamed", 1339);
        System.out.println(Student.counter);
        Student s3 = new Student("Seif", 1904);
        System.out.println(Student.counter);
        System.out.println("Student.Student 1 name is " + s1.getName() + ", and Id is " + s1.getId());
    }

}