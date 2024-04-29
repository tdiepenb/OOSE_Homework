package homework1exercise2;

public class Tutor extends Student {

    private String teachingSubject;

    public Tutor(String name, String subject, String teachingSubject) {
        super(name, subject);
        this.teachingSubject = teachingSubject;
    }

    public String getTeachingSubject() {
        return this.teachingSubject;
    }
}
