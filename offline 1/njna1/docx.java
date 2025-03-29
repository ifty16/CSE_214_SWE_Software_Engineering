public class docx implements DocumentProcessor{
    @Override
    public void LoadDocument() {
        System.out.println("Your .docx file was loaded");
    }

    @Override
    public void SaveDocument() {
        System.out.println("Your .docx file was saved");
    }
}
