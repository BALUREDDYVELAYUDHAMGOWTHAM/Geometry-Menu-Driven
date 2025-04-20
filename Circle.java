import java.util.*;
public class Circle extends Shape {
    double radius;
    public Circle(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle : ");
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
}
