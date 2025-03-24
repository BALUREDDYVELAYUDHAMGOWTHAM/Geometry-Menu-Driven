import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1:Area");
        System.out.println("2:Perimeter");
        System.out.println("3:Volume");
        System.out.print("Enter your choice:");
        int choice=sc.nextInt();
        if(choice>=1 && choice<=3)
        {
            System.out.println("1:Square");
            System.out.println("2:Circle");
            System.out.println("3:Rectangle");
            System.out.print("Enter your choice:");
            int shapechoice=sc.nextInt();
            switch (shapechoice) {
                case 1:
                    if(choice==1)
                    {
                        Square sq=new Square();
                    }
                    break;
            
                default:
                    break;
            }
        }
        else{
            System.out.println("Provide an valid input");
        }
    }
}
