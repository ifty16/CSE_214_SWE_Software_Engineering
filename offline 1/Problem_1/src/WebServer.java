public interface WebServer  {
    String getWeb();
}

class Django implements WebServer{
    @Override
    public String getWeb() {
        // TODO Auto-generated method stub
        return "Django";
    }
}

class NodeJS implements WebServer{
    @Override
    public String getWeb() {
        // TODO Auto-generated method stub
        return "NodeJS";
    }
}

class Ruby implements WebServer{
    @Override
    public String getWeb() {
        // TODO Auto-generated method stub
        return "Ruby";
    }
}
