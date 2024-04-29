package homework1exercise2;

public class PhD extends Employee {

    private String researchTopic;

    public PhD(String name, float salary, String researchTopic) {
        super(name, salary);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return this.researchTopic;
    }
}
