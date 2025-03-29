import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
//        String mode=scn.nextLine();
        String type=scn.nextLine();
        DocumentCreator dc=new Informal();
        Document infDoc=dc.getInformalDocument(type);
        System.out.println(infDoc.getDocument());

    }
}
