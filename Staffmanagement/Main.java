import java.util.Scanner;
import java.util.ArrayList;

public class StaffMngt {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        boolean endLoop = false;

        while (!endLoop) {
            System.out.println();
            System.out.println("Main menu:");
            System.out.println("1 - Employee management");
            System.out.println("2 - Employee statistics");
            System.out.println("3 - Exit");
            int userInput = sc.nextInt();
            sc.nextLine();

            switch (userInput) {
                case 1:
                    EmployeeManagement.menu();
                    break;

                case 2:
                    EmployeeStatistics.menu();
                    break;

                case 3:
                    endLoop = true;
                    break;
            
                default:
                    break;
            }
        }
    }
}