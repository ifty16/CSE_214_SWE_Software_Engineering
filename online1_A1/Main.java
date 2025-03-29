import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("please choose a number :");
        System.out.println("1.credit card");
        System.out.println("2.PayPal");
        System.out.println("3. Bitcoin");

        

        Scanner scanner1= new Scanner(System.in);
        String str=scanner1.nextLine();
        System.out.println("you chose "+ str);
        PaymentDirector director=new PaymentDirector(str);

        System.out.println("Please enter the ammount");
        double amount = scanner1.nextDouble();
        System.out.println("Processing "+amount+" tk payment via "+str+" ...");
        scanner1.close();

        
        director.pay(amount);


    }
}
