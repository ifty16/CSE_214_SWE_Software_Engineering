

public interface Display {

    String getDisplay();
    Controller getController();
}

class OLED implements Display {

    @Override
    public String getDisplay() {
        return "OLED Display";
    }
    @Override
    public Controller getController(){
        return new Separate();
    }

}

class TouchScreen implements Display {

    @Override
    public String getDisplay() {
        return "Touch Screen Display";
    }

    @Override
    public Controller getController(){
        return new BuiltIn();
    }

}

class LCD implements Display {

    @Override
    public String getDisplay() {
        return "LCD Display";
    }

    @Override
    public Controller getController(){
        return new Separate();
    }


}
class LED implements Display {

    @Override
    public String getDisplay() {
        return "LED Display";
    }

    @Override
    public Controller getController(){
        return new Separate();
    }

}
