
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter package type Basic/Standard/Advanced/premium : ");
        String packageType = scanner.nextLine();

        System.out.print("Enter Internet Connection Wifi/SIM/Ethernet : ");
        String net = scanner.nextLine();

        System.out.print("Enter web server Framework on NodeJS/Django/Ruby : ");
        String webServer = scanner.nextLine();

        scanner.close();


        FullSystem tktsys=director.buildfullTicketingSystem(packageType, net, webServer);
        if(tktsys!=null) {
            tktsys.systemPreview();
        }


    }
}