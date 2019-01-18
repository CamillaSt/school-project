public class EmployeeStatistics {
    public static void menu() {
        System.out.println();
        System.out.println("Employee statistics:");
        System.out.println("1 - Maximum salary");
        System.out.println("2 - Minimum salary");
        System.out.println("3 - Total bonus");
 
        int userInput = StaffMngt.sc.nextInt();
        StaffMngt.sc.nextLine();
        switch (userInput) {
            case 1:
                printMaxSalary();
                break;
        
            case 2:
                printMinSalary();
                break;

            case 3:
                printTotalBonus();
                break;

            default:
                System.out.println("Wrong input!");
                break;
        }
    }
    
    private static void printMaxSalary() {
        double maxSalary = StaffMngt.employees.get(0).getSalary();
        
        for (Employee e: StaffMngt.employees) {
            if (e.getSalary() > maxSalary) {
                maxSalary = e.getSalary();
            }
        }
        
        System.out.println("Maximum salary: " + maxSalary);
    }
    
    private static void printMinSalary() {
        double minSalary = StaffMngt.employees.get(0).getSalary();
        
        for (Employee e: StaffMngt.employees) {
            if (e.getSalary() < minSalary) {
                minSalary = e.getSalary();
            }
        }
        
        System.out.println("Minimum salary: " + minSalary);
    }
    
    private static void printTotalBonus() {
        double totalBonus = 0;
        
        for (Employee e: StaffMngt.employees) {
            totalBonus += e.getBonus();
        }
        
        System.out.println("Total bonus: " + totalBonus);
    }
}
