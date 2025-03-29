
public interface WebServer {
    String getWebServer();
}

class Django implements WebServer {
    @Override
    public String getWebServer() {
        return "Django";
    }
}

class NodeJs implements WebServer{
    @Override
    public String getWebServer() {
        return "NodeJs";
    }
}

class Ruby implements WebServer{
    @Override
    public String getWebServer() {
        return "Ruby";
    }
}