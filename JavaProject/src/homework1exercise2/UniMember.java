package homework1exercise2;

public class UniMember implements UniMemberInterface{

    private String name;

    public UniMember(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
