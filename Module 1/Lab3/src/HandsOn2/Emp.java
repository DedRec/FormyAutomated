package HandsOn2;

public class Emp extends Person {
    float salary;
    Emp(int id,String name,float salary){
        super(id, name);
        this.salary=salary;
    }
    public void display(){
        System.out.println("name: "+name+", id: "+id+", salary:"+salary);
    }
}
