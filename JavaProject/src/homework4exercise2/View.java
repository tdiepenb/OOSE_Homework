package homework4exercise2;

public class View implements Subscriber{

    private String name;
    private Controller controller;

    public View(String name, Controller controller) {
        this.name = name;
        this.controller = controller;
    }

    @Override
    public void update(int mainState) {
        System.out.println(name + " updated with new state: " + mainState);
    }

    public void userAction(int newState) {
        controller.setModelState(newState);
    }
}
