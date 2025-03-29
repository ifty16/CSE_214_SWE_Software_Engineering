import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your File name :");
        String filename = scn.nextLine();

        DocumentFactory Df = new DocumentFactory();
        DocumentProcessor Dp = Df.getDocType(filename);

        if(Dp != null){
            Dp.LoadDocument();
            Dp.SaveDocument();
        }
        else{
            System.out.println("File format not recognized");
        }
    }
}
