import java.util.*;
public class Rectangle extends Shape{
    double length;
    double breadth;
    public Rectangle(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length: ");
        this.length=sc.nextDouble();
        System.out.print("Enter the breadth: ");
        this.breadth=sc.nextDouble();
    }
    @Override
    void getArea(){
        System.out.println("Area: "+length*breadth);
    }
    @Override
    void getPerimeter(){
        System.out.println("Perimeter: "+2*(length+breadth));
    }
}

   