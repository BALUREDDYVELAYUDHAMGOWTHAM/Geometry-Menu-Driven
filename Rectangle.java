import java.util.*;
public class Rectangle extends Shape{
    double length;
    double breadth;
    Scanner sc=new Scanner(System.in);
    Rectangle(){
        System.out.print("Enter the length: ");
        length=sc.nextDouble();
        System.out.print("Enter the breadth: ");
        breadth=sc.nextDouble();
    }
    void getArea(){
        System.out.println("Area: "+length*breadth);
        System.out.println();
    }

    void getPerimeter(){
        System.out.println("Perimeter: "+2*(length+breadth));
        System.out.println();
    }

    void getVolume(){
        System.out.println("Not possible to find the volume");
        System.out.println();
    }
}

   