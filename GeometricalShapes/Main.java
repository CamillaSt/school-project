import java.util.Scanner;

public class Shapes {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
      
       
       System.out.println("Choose one of the options: Circle, Rectangle or Triangle");
       String userInput = sc.nextLine();
        
       if(userInput.equalsIgnoreCase("Circle")) {
            
            System.out.println("Set the circle's radius");
            double radieInput = sc.nextDouble();
            Circle c = new Circle(radieInput);
            
            
            System.out.println("What would you like to calculate?");
            System.out.println("For area enter 1");
            System.out.println("For circumference enter 2");
            System.out.println("For both enter 3");
            int userChoice = sc.nextInt();
            
            switch (userChoice) {
                case 1:
                    System.out.println("The circle's area is " + c.area());
                    break;
                case 2:
                    System.out.println("The circle's circumference is " + c.circumference());
                    break;
                case 3:
                    System.out.println("The circle's area is " + c.area() + " and circumference is " + c.circumference());
                    break;
           }
                
            
      }else if (userInput.equalsIgnoreCase("Rectangle")) {
            System.out.println("Set the rectangle's shortside and longside");
            double shortSide = sc.nextDouble();
            double longSide = sc.nextDouble();
            Rectangle r = new Rectangle(shortSide, longSide);
            
            System.out.println("What would you like to calculate?");
            System.out.println("For area enter 1");
            System.out.println("For circumference enter 2");
            System.out.println("For both enter 3");
            int userChoice = sc.nextInt();
            
            switch (userChoice) {
                case 1:
                    System.out.println("The rectangle's area is " + r.area());
                    break;
                case 2:
                    System.out.println("The rectangle's circumference is " + r.circumference());
                    break;
                case 3:
                    System.out.println("The rectangle's area is " + r.area() + " and circumference is " + r.circumference());
                    break; 
           }
           
          
    } else {
           System.out.println("Set the triangle's base and height");
           double base = sc.nextDouble();
           double height = sc.nextDouble();
           Triangel t = new Triangel(base, height);
           
           System.out.println("What would you like to calculate?");
           System.out.println("For area enter 1");
           System.out.println("For circumference enter 2");
           System.out.println("For both enter 3");
           int userChoice = sc.nextInt();
           
            switch (userChoice) {
                case 1:
                    System.out.println("The triangle's ares is " + t.area());
                    break;
                case 2:
                    System.out.println("The triangle's circumference is " + t.circumference());
                    break;
                case 3:
                    System.out.println("The triangle's area is " + t.area() + " and circumference is " + t.circumference());
                    break;
           }
      }
   }
}