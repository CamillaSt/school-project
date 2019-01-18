public class EmployeeManagement {
    public static void menu() {
        System.out.println();
        System.out.println("Staff management:");
        System.out.println("1 - Add");
        System.out.println("2 - Remove");
        System.out.println("3 - List all");
 
        int userInput = StaffMngt.sc.nextInt();
        StaffMngt.sc.nextLine();
        switch (userInput) {
            case 1:
                addEmployee();
                break;
        
            case 2:
                removeEmployee();
                break;

            case 3:
                listAllEmployees();
                break;

            default:
                System.out.println("Wrong input!");
                break;
        }
    }

    private static void addEmployee() {
        System.out.println();
        System.out.println("Add employee:");
        System.out.print("First name: ");
        String firstName = StaffMngt.sc.nextLine();
        System.out.print("Last name: ");
        String lastName = StaffMngt.sc.nextLine();
        System.out.print("Department (1 - Engineering, 2 - Support): ");
        int department = StaffMngt.sc.nextInt();
        System.out.print("Gender: ");
        StaffMngt.sc.nextLine();
        String gender = StaffMngt.sc.nextLine();
        System.out.print("Salary: ");
        double salary = StaffMngt.sc.nextDouble();
        System.out.print("Age: ");
        int age = StaffMngt.sc.nextInt();

        switch (department) {
            case 1:
                Employee programmer = new Programmer(firstName, lastName, gender, salary, age);
                StaffMngt.employees.add(programmer);
                break;

            case 2:
                Employee technician = new Technician(firstName, lastName, gender, salary, age);
                StaffMngt.employees.add(technician);
                break;
        }
    }

    private static void removeEmployee() {
        System.out.println();
        System.out.println("Delete employee:");
        System.out.print("First name: ");
        String firstName = StaffMngt.sc.nextLine();
        System.out.print("Last name: ");
        String lastName = StaffMngt.sc.nextLine();
        
        int index = -1;
        for (int i = 0; i  < StaffMngt.employees.size(); i++) {
            Employee e = StaffMngt.employees.get(i);
            if (firstName.equals(e.getFirstName()) && lastName.equals(e.getLastName())) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee not found!");
        } else {
            StaffMngt.employees.remove(index);
        }
    }

    private static void listAllEmployees() {
        System.out.println();
        if (StaffMngt.employees.size() == 0) {
            System.out.println("No employees found!");
        } else {
            System.out.println("Listing employees:");
            for (int i = 0; i < StaffMngt.employees.size(); i++) {
                StaffMngt.employees.get(i).print();
            }
        }
    }
}