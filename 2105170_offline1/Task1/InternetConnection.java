
public interface InternetConnection {
    String getInternetConnection();
}

class Ethernet implements InternetConnection {
    @Override
    public String getInternetConnection() {
        return "Ethernet";
    }
}

class WiFi implements InternetConnection {
    @Override
    public String getInternetConnection() {
        return "WiFi";
    }
}

class Modules implements InternetConnection {
    @Override
    public String getInternetConnection() {
        return "GSM modules";
    }
}