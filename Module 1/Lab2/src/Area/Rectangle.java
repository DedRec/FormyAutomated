package Area;

import java.lang.Math;
public class Rectangle {
    private Point p1,p2;
    Rectangle(Point p1,Point p2){
        this.p1=p1;
        this.p2=p2;
    }
    public double calculateArea(){
        return Math.abs(p1.getY() -p2.getY())*Math.abs(p1.getX()-p2.getX());
    }
    public static void main(String[] args){
        Point p1= new Point(0,0);
        Point p2= new Point(3,3);
        Rectangle r1=new Rectangle(p1,p2);
        System.out.println(r1.calculateArea());
    }
}
