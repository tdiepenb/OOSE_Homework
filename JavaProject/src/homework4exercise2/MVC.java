package homework4exercise2;

public class MVC{

    public static void main(String[] args) {
        Model model = new Model();

        Controller controller = new Controller(model);

        View view1 = new View("View1", controller);
        View view2 = new View("View2", controller);
        View view3 = new View("View3", controller);
        model.subscribe(view1);
        model.subscribe(view2);
        model.subscribe(view3);

        //Set State
        controller.setModelState(0);

        //Simulate User action
        view1.userAction(1);
        view2.userAction(2);
        view3.userAction(3);
        view1.userAction(1);
    }
}
