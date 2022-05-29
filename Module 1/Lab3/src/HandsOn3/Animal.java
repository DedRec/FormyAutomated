package HandsOn3;

public abstract class Animal {
    protected String color="default color";
    public void display_color(){
        System.out.println(color);
    }
    abstract void speak();
}
