import java.util.Scanner;

public class Main {
    static void Area(Shape shape, int input) {
        switch (input) {
            case 1 -> shape.getArea();
            case 2 -> shape.getPerimeter();
            case 3 -> shape.getVolume();
            default ->  {
                System.out.println("Invalid input! Please choose a valid option.");
                break;
            }
        }
    }  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Choose a shape: rectangle, square, circle");
            String shapeType = scanner.next().toLowerCase();
            
            Shape shape = null;
    
            switch (shapeType) {
                case "rectangle":
                    shape = new Rectangle();
                    break;
                    
                    case "square":
                    shape = new Square();
                    break;
                    
                    case "circle":
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
                if(input>3) break;
            }
        }
    }
}
