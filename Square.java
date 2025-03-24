import java.util.*;

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
