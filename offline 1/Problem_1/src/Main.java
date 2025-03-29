import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Package: ");
        String a= scanner.nextLine();
        System.out.print("Enter Internet: ");
        String b= scanner.nextLine();
        System.out.print("Enter Framework: ");
        String c= scanner.nextLine();
        Builder builder= new Builder();
        Packagee p= builder.getPackage(a,c,b);

        if (p != null) {
            System.out.println("Package Details:");
            System.out.println("Package: " + p.geDisplay());
            System.out.println("Internet: " + p.geMicrocontroller());
            System.out.println("Framework: " + p.getInt(a));
        } else {
            System.out.println("Invalid package details provided.");
        }
        scanner.close();
    }
}
