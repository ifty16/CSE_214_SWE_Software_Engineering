
public interface Ticketing {
    String getTicketingMethod();
}

class RFID implements Ticketing {
    @Override
    public String getTicketingMethod() {
        return "RFID";
    }
}

class NFC implements Ticketing {
    @Override
    public String getTicketingMethod() {
        return "NFC";
    }
}