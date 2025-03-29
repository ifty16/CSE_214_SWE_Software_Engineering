public class txt implements DocumentProcessor{
    @Override
    public void LoadDocument() {
        System.out.println("Your .txt file was loaded");
    }

    @Override
    public void SaveDocument() {
        System.out.println("Your .txt file was saved");
    }
}
