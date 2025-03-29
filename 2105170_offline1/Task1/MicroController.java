

public interface MicroController {

    Storage getStorage();
    Ticketing getTicketing();
    String getMicroController();

    
}

class ATMega32 implements MicroController {

    @Override
    public String getMicroController() {
        return "ATMega32";
    }

    @Override 
    public Storage getStorage(){
        return new SDcard();
    }

    @Override
    public Ticketing getTicketing(){
        return new RFID();
    }
}

class ArduinoMega implements MicroController {

    @Override
    public String getMicroController() {
        return "Arduino Mega";
    }


    @Override 
    public Storage getStorage(){
        return new SDcard();
    }
    @Override
    public Ticketing getTicketing(){
        return new RFID();
    }
}

class RaspberryPi implements MicroController {

    @Override
    public String getMicroController() {
        return "Raspberry Pi";
    }

    
    @Override 
    public Storage getStorage(){
        return new Free();
    }
    @Override
    public Ticketing getTicketing(){
        return new NFC();
    }
}