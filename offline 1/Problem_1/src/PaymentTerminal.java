public interface PaymentTerminal {
    String getPaid();
}

class Pay implements PaymentTerminal{
    @Override
    public String getPaid() {
        // TODO Auto-generated method stub
        return "On spot payment";
    }
}

class Collect implements PaymentTerminal{
    @Override
    public String getPaid() {
        // TODO Auto-generated method stub
        return "Collected cash";
    }
}

class StoreCash implements PaymentTerminal{
    @Override
    public String getPaid() {
        // TODO Auto-generated method stub
        return "Stored Cash";
    }
}

class Change implements PaymentTerminal{
    @Override
    public String getPaid() {
        // TODO Auto-generated method stub
        return "Provided Change";
    }
}
