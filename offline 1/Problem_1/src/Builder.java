public class Builder {
    public Packagee getPackage(String p,String w, String i){
        
        if (p.equalsIgnoreCase("basic")) {
            return new Basic(i,w);
        }
        if (p.equalsIgnoreCase("standard")) {
            return new Standard(i,w);
        }
        if (p.equalsIgnoreCase("advanced")) {
            return new Advanced(i,w);
        }
        if (p.equalsIgnoreCase("premium")) {
            return new Premium(i,w);
        }
        return null;
    }
}