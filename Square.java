import java.util.*;
class Square extends Shape{
    double side;
    public Square()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side of the Square: ");
        this.side=sc.nextDouble();
    }

    @Override
    void getArea()
    {
        System.out.println("The Area of the Square is "+(side * side));
    }
    
    @Override
    void getPerimeter()
    {
        System.out.println("The Perimeter of the Square is "+(4 * side));
    }
}