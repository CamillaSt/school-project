public class Technician extends Employee {
    public Technician(String firstName, String lastName, String gender, double salary, int age) {
        super(firstName, lastName, "Support", gender, salary, age);
    }
    
    @Override
    public double getBonus() {
        return 0.15 * salary;
    }
}