package Student;

public class Student2 {
    String name;
    int rollno;
    float fee;
    Student2(String name, int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    Student2(String name, int rollno,float fee){
        this(name,rollno);
        this.fee=fee;
    }
    void display(){
        System.out.println(name+" "+rollno+" "+fee);
    }
    public static void main(String[] args){
        Student2 s1=new Student2("Seif",112,6000f);
        s1.display();
    }
}
