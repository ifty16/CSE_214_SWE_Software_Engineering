public interface  AbstractFactory {
    public Loan getLoan();
    public Savings getSavings();
}

class RegularFactory implements AbstractFactory {
    @Override
    public Loan getLoan() {
        return new RegularLoan();
    }
    @Override
    public Savings getSavings() {
        return new RegularSavings();
    }



}

class PremiumFactory implements AbstractFactory {
    @Override
    public Loan getLoan() {
        return new PremiumLoan();
    }
    @Override
    public Savings getSavings() {
        return new PremiumSavings();
    }
}

class VIPFactory implements AbstractFactory {
    @Override
    public Loan getLoan() {
        return new VIPLoan();
    }
    @Override
    public Savings getSavings() {
        return new VIPSavings();
    }
}
