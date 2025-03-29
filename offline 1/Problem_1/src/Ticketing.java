public interface Ticketing {
    String getTicket();
}

class RFID implements Ticketing {
    @Override
    public String getTicket() {
        // TODO Auto-generated method stub
        return "RFID";
    }
    
}

class NFC implements Ticketing {
    @Override
    public String getTicket() {
        // TODO Auto-generated method stub
        return "NFC";
    }
    
}