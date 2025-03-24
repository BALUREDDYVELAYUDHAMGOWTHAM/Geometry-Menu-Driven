import java.util.*;
class square extends Shape{
    double side;
    Scanner sc=new Scanner(System.in);
    square()
    {
        System.out.println("Enter the side of the Circle : ");
        this.side=sc.nextDouble();
    }
    void getArea()
    {
        System.out.println("The Area of the Square is "+(side * side));
    }

    void getPerimeter()
    {
        System.out.println("The Perimeter of the Square is "+(4 * side));
    }

    void getVolume()
    {
        System.out.println("Square has no volume");
    }
}