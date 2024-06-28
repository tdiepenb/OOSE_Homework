package homework4exercise2;

public class Controller {

    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void setModelState(int mainState) {
        model.setMainState(mainState);
    }
}
