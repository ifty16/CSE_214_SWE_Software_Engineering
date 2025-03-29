public interface Display {
    String getDisplay();
}

class TouchScreen implements Display {
    @Override
    public String getDisplay() {
        System.out.println("Touch screen");
        // TODO Auto-generated method stub
        return "Touch Screen";
    }
    
}

class OLED implements Display {
    @Override
    public String getDisplay() {
        System.out.println("OLED");
        // TODO Auto-generated method stub
        return "OLED";
    }
    
}

class LCD implements Display {
    @Override
    public String getDisplay() {
        System.out.println("LCD");
        // TODO Auto-generated method stub
        return "LCD";
    }
    
}

class LED implements Display {
    @Override
    public String getDisplay() {
        System.out.println("LED");
        // TODO Auto-generated method stub
        return "LED";
    }
    
}

