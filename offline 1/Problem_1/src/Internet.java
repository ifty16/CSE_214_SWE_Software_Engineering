public interface Internet {
    String getInternet();
}


class WiFi implements Internet{
    @Override
    public String getInternet() {
        System.out.println("This is wifi");
        // TODO Auto-generated method stub
        return "WiFi";
    }
}

class GSM implements Internet{
    @Override
    public String getInternet() {
        // TODO Auto-generated method stub
        return "GSM";
    }
}

class Ethernet implements Internet{
    @Override
    public String getInternet() {
        // TODO Auto-generated method stub
        return "Ethernet";
    }
}