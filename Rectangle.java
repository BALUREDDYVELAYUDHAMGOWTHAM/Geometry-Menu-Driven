import java.util.*;
class Rect{
    double length;
    double breadth;

    Rect(){
        length=0;
        breadth=0;
    }

    Rect(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    Rect(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    void CalculateArea(){
        System.out.println("Area: "+length*breadth);
        System.out.println();
    }

    void CalculatePeri(){
        System.out.println("Perimeter: "+2*(length+breadth));
        System.out.println();
    }
}

public class Rectangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("Given choices:");
            System.out.println("1. Calculate Area");
            System.out.println("2. Calculate Perimeter");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("Enter the length:");
                double length=sc.nextDouble();
                System.out.println("Enter the breadth:");
                double breadth=sc.nextDouble();
                Rect obj1=new Rect(length,breadth);
                obj1.CalculateArea();
            }
            if(choice==2){
                System.out.print("Enter the length: ");
                double length=sc.nextDouble();
                System.out.print("Enter the breadth: ");
                double breadth=sc.nextDouble();
                Rect obj2=new Rect(length,breadth);
                obj2.CalculatePeri();
            }
            if(choice==3){
                System.out.print("Successfully Quit");
                flag=false;
            }
        }

    }
}