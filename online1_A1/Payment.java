public interface Payment {
    public void pay(double amount);
}

class  CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println(amount+ " tk paid via credit card ");
    }
}

class PaypalPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println(amount+ " tk paid via paypall ");
    }
}

abstract class  Cryptocurrency implements Payment{
    
}

class Bitcoin extends Cryptocurrency{
    @Override
    public void pay(double amount) {
        System.out.println(amount+ " tk paid via bitcoin ");
    }
}