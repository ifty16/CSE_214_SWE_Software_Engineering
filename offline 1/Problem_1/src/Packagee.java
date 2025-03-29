public interface Packagee {
    Microcontroller geMicrocontroller();
    Display geDisplay();
    Internet getInt(String a);
    WebServer getWebb(String b);
}

class Basic implements Packagee{
    String a;
    String b;
    Basic(String a, String b){
        this.a=a;
        this.b=b;
    }
    @Override
    public Display geDisplay() {
        // TODO Auto-generated method stub
        return new LCD();
    }
    @Override
    public Microcontroller geMicrocontroller() {
        // TODO Auto-generated method stub
        return new ATMega32();
    }
    @Override
    public Internet getInt(String a) {
        a=this.a;
        if (a.equalsIgnoreCase("wifi")) {
            return new WiFi();
        }
        if (a.equalsIgnoreCase("SIM")) {
            return new GSM();
        }
        // if (a.equalsIgnoreCase("Ethernet")) {
        //     return new Ethernet();
        // }
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public WebServer getWebb(String b) {
        b=this.b;
        if (b.equalsIgnoreCase("Django")) {
            return new Django();
        }
        if (b.equalsIgnoreCase("nodejs")) {
            return new NodeJS();
        }
        if (b.equalsIgnoreCase("ruby")) {
            return new Ruby();
        }
        // TODO Auto-generated method stub
        return null;
    }
}

class Standard implements Packagee{
    String a,b;
    Standard(String a, String b){
        this.a=a;
        this.b=b;
    }
    @Override
    public Display geDisplay() {
        // TODO Auto-generated method stub
        return new LED();
    }
    @Override
    public Microcontroller geMicrocontroller() {
        // TODO Auto-generated method stub
        return new ArduinoMega();
    }
    @Override
    public Internet getInt(String a) {
        a=this.a;
        if (a.equalsIgnoreCase("wifi")) {
            return new WiFi();
        }
        if (a.equalsIgnoreCase("SIM")) {
            return new GSM();
        }
        // if (a.equalsIgnoreCase("Ethernet")) {
        //     return new Ethernet();
        // }
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public WebServer getWebb(String b) {
        b=this.b;
        if (b.equalsIgnoreCase("Django")) {
            return new Django();
        }
        if (b.equalsIgnoreCase("nodejs")) {
            return new NodeJS();
        }
        if (b.equalsIgnoreCase("ruby")) {
            return new Ruby();
        }
        // TODO Auto-generated method stub
        return null;
    }
}

class Advanced implements Packagee{
    String a,b;
    Advanced(String a, String b){
        this.a=a;
        this.b=b;
    }
    @Override
    public Display geDisplay() {
        // TODO Auto-generated method stub
        return new OLED();
    }
    @Override
    public Microcontroller geMicrocontroller() {
        // TODO Auto-generated method stub
        return new RaspberryPi();
    }
    @Override
    public Internet getInt(String a) {
        a=this.a;
        if (a.equalsIgnoreCase("wifi")) {
            return new WiFi();
        }
        if (a.equalsIgnoreCase("SIM")) {
            return new GSM();
        }
        if (a.equalsIgnoreCase("Ethernet")) {
            return new Ethernet();
        }
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public WebServer getWebb(String b) {
        b=this.b;
        if (b.equalsIgnoreCase("Django")) {
            return new Django();
        }
        if (b.equalsIgnoreCase("nodejs")) {
            return new NodeJS();
        }
        if (b.equalsIgnoreCase("ruby")) {
            return new Ruby();
        }
        // TODO Auto-generated method stub
        return null;
    }
}

class Premium implements Packagee{
    String a,b;
    Premium(String a, String b){
        this.a=a;
        this.b=b;
    }
    @Override
    public Display geDisplay() {
        // TODO Auto-generated method stub
        return new TouchScreen();
    }
    @Override
    public Microcontroller geMicrocontroller() {
        // TODO Auto-generated method stub
        return new RaspberryPi();
    }
    @Override
    public Internet getInt(String a) {
        a=this.a;
        if (a.equalsIgnoreCase("wifi")) {
            return new WiFi();
        }
        if (a.equalsIgnoreCase("SIM")) {
            return new GSM();
        }
        if (a.equalsIgnoreCase("Ethernet")) {
            return new Ethernet();
        }
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public WebServer getWebb(String b) {
        b=this.b;
        if (b.equalsIgnoreCase("Django")) {
            return new Django();
        }
        if (b.equalsIgnoreCase("nodejs")) {
            return new NodeJS();
        }
        if (b.equalsIgnoreCase("ruby")) {
            return new Ruby();
        }
        // TODO Auto-generated method stub
        return null;
    }
}
