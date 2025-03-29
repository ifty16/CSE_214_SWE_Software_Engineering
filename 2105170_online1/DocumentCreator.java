public interface DocumentCreator {
    public Document getFormalDocument(String doctype);
    public Document getInformalDocument(String doctype);
    
} 

class Formal implements DocumentCreator{
    @Override
    public Document getFormalDocument(String doctype){
        if(doctype.equalsIgnoreCase("letter")){
            return new Letter();
        }
        else if(doctype.equalsIgnoreCase("resume")){
            return new Resume();
        }
        else{
            System.out.println("mot valid doxtype");
            return null;
        }
    }

    @Override
    public Document getInformalDocument(String doctype){
        return null;
    }

}

class Informal implements DocumentCreator{
    @Override
    public Document getInformalDocument(String doctype){
        if(doctype.equalsIgnoreCase("letter")){
            return new Letter();
        }
        else if(doctype.equalsIgnoreCase("resume")){
            return new Resume();
        }
        else{
            System.out.println("mot valid doxtype");
            return null;
        }
    }
    
    @Override
    public Document getFormalDocument(String doctype){
        return null;
    }

}