public class Programmer extends Employee {
    public Programmer(String firstName, String lastName, String gender, double salary, int age) {
        super(firstName, lastName,"Engineering", gender, salary, age);
    }
    
    @Override
    public double getBonus() {
        return 0.22 * salary;
    }
}