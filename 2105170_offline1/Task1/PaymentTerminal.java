
public interface  PaymentTerminal {
    String getPaymentTerminal();
}

class Cash implements PaymentTerminal {
    @Override
    public String getPaymentTerminal() {
        return "On Spot Cash Payment";
    }
}