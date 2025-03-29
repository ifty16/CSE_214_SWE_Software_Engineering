public class PaymentDirector {
    public Payment paymethod=null;
    public PaymentDirector(String method){
        if(method.equalsIgnoreCase("credit card")){
            paymethod= new CreditCardPayment();
        }
        else if(method.equalsIgnoreCase("paypal")){
            paymethod= new PaypalPayment();
        }
        else if(method.equalsIgnoreCase("bitcoin")){
            paymethod= new Bitcoin();
        }
        else{
            System.out.println(" not valid method ");
        }
    }
    public void pay(double amount){
        if(paymethod ==null){
            System.out.println("method not selected yet ");
            return;
        }
        paymethod.pay(amount);
        System.out.println("payment success");
    }

}
