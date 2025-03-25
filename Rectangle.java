import java.util.*;
public class Rectangle extends Shape{
    double length;
    double breadth;
    double height;
    public Rectangle(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length: ");
        this.length=sc.nextDouble();
        System.out.print("Enter the breadth: ");
        this.breadth=sc.nextDouble();
        System.out.print("Enter the height: ");
        this.height=sc.nextDouble();
    }
    @Override
    void getArea(){
        System.out.println("Area: "+length*breadth);
    }
    @Override
    void getPerimeter(){
        System.out.println("Perimeter: "+2*(length+breadth));
    }
    
    @Override
    void getVolume(){
        System.out.println("Assuming it has cuboid");
        System.out.println("The Volume of the Cuboid is "+(length * breadth * height));
    }
}

   