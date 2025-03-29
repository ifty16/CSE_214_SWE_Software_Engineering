public interface Controller {
    String getController();
}

class TouchScreenC implements Controller{
    @Override
    public String getController() {
        // TODO Auto-generated method stub
        return "Touch Screen";
    }
}

class SeparateUnit implements Controller{
    @Override
    public String getController() {
        // TODO Auto-generated method stub
        return "Seperate Unit";
    }
}
