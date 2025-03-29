public interface Document {

    public String getDocument();
}


class Letter implements Document {

    @Override
    public String getDocument(){
        return "this is a Letter";
    }
}
class Resume implements Document {

    @Override
    public String getDocument(){
        return "this is a Resume";
    }
}