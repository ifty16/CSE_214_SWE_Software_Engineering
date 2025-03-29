public interface Controller {
    
    String getController();
}

class BuiltIn implements Controller {
    @Override
    public String getController() {
        return "Built-in Controller";
    }
}

class Separate implements Controller {
    @Override
    public String getController() {
        return "External Controller";
    }
}