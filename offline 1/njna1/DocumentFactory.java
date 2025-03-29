public class DocumentFactory {
    public DocumentProcessor getDocType(String docType){


        if (docType == null) {
            return null;
        }

        String lowercase = docType.toLowerCase();
        if(lowercase.endsWith("txt")){
            return new txt();
        }

        else  if(lowercase.endsWith("pdf")){
            return new Pdf();
        }

        else if(lowercase.endsWith("docx")){
            return new docx();
        }

        return null;
    }
}
