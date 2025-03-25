import java.util.Scanner;

public class Main {
    static void Area(Shape shape, int input) {
        switch (input) {
            case 1 -> shape.getArea();
            case 2 -> shape.getPerimeter();
            default ->  {
                System.out.println("Invalid input! Please choose a valid option.");
                break;
            }
        }
    }  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Shape: To choose Rectangle -> Enter 1");
        System.out.println("Shape: To choose Square -> Enter 2");
        System.out.println("Shape: To choose Circle -> Enter 3");
        int shapeType=scanner.nextInt();
        
        Shape shape = null;

        switch (shapeType) {
            case 1:
                shape = new Rectangle();
                break;
                
                case 2:
                shape = new Square();
                break;
                
                case 3:
                shape = new Circle();
                break;

            default:
                System.out.println("Invalid shape selected!");
                System.exit(0);
        }   

        System.out.println("Choose operation: 1. Area 2. Perimeter 3. Volume");
        while (true) { 
            int input = scanner.nextInt();
            Area(shape, input); 
            if(input>2 && input<1) break;
        }
    }
}
