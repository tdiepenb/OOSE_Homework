package homework1exercise2;

public class Student extends UniMember implements StudentInterface{

    private String subject;

    public Student(String name, String subject) {
        super(name);
        this.subject = subject;

    }

    @Override
    public String getSubject() {
        return this.subject;
    }
}
