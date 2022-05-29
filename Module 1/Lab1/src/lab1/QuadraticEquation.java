package lab1;

import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args){
        System.out.println("Enter value of X");
        Scanner input=new Scanner(System.in);
        double x=input.nextDouble();
        double solution= 3*x*x-8*x+4;
        System.out.println(solution);
    }

}
