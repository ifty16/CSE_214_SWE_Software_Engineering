import java.util.Scanner;

public class ClientChoiceClass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your payment Choice :");
        String paymentType = scn.nextLine();
        Payment P ;
        PaymentFactory Pf = new PaymentFactory();

        P = Pf.getPayment(paymentType);
        P.PaymentType();

    }
}
