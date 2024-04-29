package homework1exercise2;

public class Professor extends Employee {

    private String chair;

    public Professor(String name, float salary, String chair) {
        super(name, salary);
        this.chair = chair;
    }

    public String getChair() {
        return this.chair;
    }
}
