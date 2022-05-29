package lab1;
import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        int arr[]=new int[4];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<4;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<4;i++){
            if(arr[i]==2||arr[i]==3||arr[i]==5){
                System.out.println(i+" A prime found here!");
            }
        }
    }
}
