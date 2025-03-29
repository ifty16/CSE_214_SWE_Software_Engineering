public class Pdf implements DocumentProcessor{

    @Override
    public void LoadDocument() {
        System.out.println("Your .pdf file was loaded");
    }

    @Override
    public void SaveDocument() {
        System.out.println("Your .pdf file was saved");
    }
}
