public interface Storage {
    String getStorage();
}

class DefaultStorage implements Storage{
    @Override
    public String getStorage() {
        // TODO Auto-generated method stub
        return "Default";
    }
}

class SDcard implements Storage{
    @Override
    public String getStorage() {
        // TODO Auto-generated method stub
        return "SDcard";
    }
}
