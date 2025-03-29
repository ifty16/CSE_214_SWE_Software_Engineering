public class PaymentFactory {
    public Payment getPayment(String paymentOption){
        if (paymentOption == null) {
            return null;
        }
        if(paymentOption.equalsIgnoreCase("Credit Card")){
            return new CreditCard();
        }
        else if (paymentOption.equalsIgnoreCase("Paypal")) {
            return new PayPal();
        }
        else if (paymentOption.equalsIgnoreCase("Crypto Currency")){
            return new CryptoCurrency();
        }


        return null;
    }
}
