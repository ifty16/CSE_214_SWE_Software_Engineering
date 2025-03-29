
public interface  Storage {
    public String getStorage();
}

class Free implements Storage {
    @Override
    public String getStorage() {
        return "Provided along with micro controller";
    }
}
class SDcard implements Storage {
    @Override
    public String getStorage() {
        return "SD card";
    }
}
