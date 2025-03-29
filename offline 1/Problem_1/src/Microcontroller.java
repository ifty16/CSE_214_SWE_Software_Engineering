public interface Microcontroller {
    String getMC();
    Storage getStore();
    // Internet getInternetMC(String a);
    Ticketing getTicket();
    Controller getControl();
}


class ATMega32 implements Microcontroller {
    @Override
    public String getMC(){
        return "ATMega32";
    }
    @Override
    public Storage getStore() {
        // TODO Auto-generated method stub
        return new SDcard();
    }

    // @Override
    // public Internet getInternetMC(String a) {
    //     // TODO Auto-generated method stub
    //     if (a.equalsIgnoreCase("wifi")) {
    //         return new WiFi();
    //     }
    //     if (a.equalsIgnoreCase("SIM")) {
    //         return new GSM();
    //     }
    //     return null;
    // }
    @Override
    public Ticketing getTicket() {
        // TODO Auto-generated method stub
        return new RFID();
    }
    @Override
    public Controller getControl() {
        // TODO Auto-generated method stub
        return new SeparateUnit();
    }
    
}

class ArduinoMega  implements Microcontroller {
    @Override
    public String getMC(){
        return "Arduino Mega";
    }
    @Override
    public Storage getStore() {
        // TODO Auto-generated method stub
        return new SDcard();
    }
    // @Override
    // public Internet getInternetMC(String a) {
    //     // TODO Auto-generated method stub
    //     if (a.equalsIgnoreCase("wifi")) {
    //         return new WiFi();
    //     }
    //     if (a.equalsIgnoreCase("SIM")) {
    //         return new GSM();
    //     }
    //     return null;
    // }
    @Override
    public Ticketing getTicket() {
        // TODO Auto-generated method stub
        return new RFID();
    }
    @Override
    public Controller getControl() {
        // TODO Auto-generated method stub
        return new SeparateUnit();
    }
    
} 

class RaspberryPi implements Microcontroller {
    @Override
    public String getMC(){
        return "Raspberry Pi";
    }
    @Override
    public Storage getStore() {
        // TODO Auto-generated method stub
        return new DefaultStorage();
    }
    // @Override
    // public Internet getInternetMC(String a) {
    //     // TODO Auto-generated method stub
    //     if (a.equalsIgnoreCase("wifi")) {
    //         return new WiFi();
    //     }
    //     if (a.equalsIgnoreCase("SIM")) {
    //         return new GSM();
    //     }
    //     if (a.equalsIgnoreCase("Ethernet")) {
    //         return new Ethernet();
    //     }
    //     return null;
    // }
    @Override
    public Ticketing getTicket() {
        // TODO Auto-generated method stub
        return new NFC();
    }
    @Override
    public Controller getControl() {
        // TODO Auto-generated method stub
        return new TouchScreenC();
    }
    
}


