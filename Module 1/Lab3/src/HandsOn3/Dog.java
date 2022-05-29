package HandsOn3;

public class Dog extends Animal {
    public void update_dog_color(){
        color="Brown";
    }

    @Override
    void speak() {
        System.out.println("barking");
    }
}
