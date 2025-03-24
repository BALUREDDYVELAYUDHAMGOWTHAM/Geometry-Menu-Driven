import java.util.*;
public class Circle extends Shape {
    double radius;
    Scanner sc=new Scanner(System.in);
    public Circle(){
        this.radius=sc.nextDouble();
    }
    @Override
    void getArea() {
       System.out.println("Area of Cicle : "+(3.14*radius*radius));
        
    }

    @Override
    void getPerimeter() {
        System.out.println("Perimeter of Cicle : "+(2*3.14*radius));
    }

    @Override
    void getVolume() {
        System.out.println("Circle  has no volume");
    }
    
}
