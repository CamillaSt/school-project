public abstract class Employee {
    private String firstName;
    private String lastName;
    private String department;
    private String gender;
    protected double salary;
    private int age;

    public Employee(String firstName, String lastName, String department, String gender, double salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.gender = gender;
        this.salary = salary;
        this.age = age;
    }

    public abstract double getBonus();
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
     public String getDepartment() {
        return department;
     }
     
    public void setDepartment(String department){
        this.department = department;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void print() {
        System.out.println(firstName + " " + lastName + " " + department + " " + gender + " " + age + " " + salary);
    }
}