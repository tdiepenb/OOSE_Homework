package homework1exercise2;

public class Employee extends UniMember implements EmployeeInterface {

    private float salary;

    public Employee(String name, float salary)  {
        super(name);
        this.salary = salary;
    }

    @Override
    public float getSalary() {
        return this.salary;
    }
}
