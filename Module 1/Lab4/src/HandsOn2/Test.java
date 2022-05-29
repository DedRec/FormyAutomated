package HandsOn2;

import java.util.*;

public class Test {
    public static void main(String[]args){
        RemoteControl r1;
        double rand=Math.random();
        if(rand<0.5){
            r1=new TV();
        }
        else{
            r1=new DVD();
        }
        r1.volumeUp();
        if(r1 instanceof TV){
            System.out.println("TV");
        }
        else
            System.out.println("DVD");
    }
}
