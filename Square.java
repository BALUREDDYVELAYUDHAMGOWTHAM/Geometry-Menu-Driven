import java.util.*;
<<<<<<< HEAD

public class Square{
    int side;
    Square(){
        side=0;
    }
    Square(int side){
        this.side=side;
    }
    void area(){
        System.out.print("Area of the Square :"+(side*side));
    }
    void perimeter(){
        System.out.print("Perimeter of the Square :"+(4*side));
    }
    void volume(){
        System.out.print("Volume of the Square :"+(side*side*side));
    }
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the side of a Square :");
        int side=scan.nextInt();

        Square sq=new Square(side);
        System.out.println("For Area enter 1");
        System.out.println("For Perimeter enter 2");
        System.out.println("For Volume enter 3");
        int choice =scan.nextInt();
        switch(choice){
            case 1:
                sq.area();
                break;
            case 2:
                sq.perimeter();
                break;
            case 3:
                sq.volume();
                break;
            default:
                System.out.print("Invalid input");
                break;
        }
    }
}
=======
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
    
    @Override
    void getVolume()
    {
        System.out.println("Assuming it has Cube");
        System.out.println("The Volume of the Cube is "+(side * side * side));
    }
}
>>>>>>> 2508fc76b910b4f1f701d12d2e8bb99bd719466e
