public abstract class  Loan {
    abstract double getInterestRate();
    abstract double calculatInterest(int months);

}

class RegularLoan extends  Loan{
    @Override
    public double getInterestRate() {
        return 14;
    }
    @Override
    public double calculatInterest(int months){
        return months * getInterestRate();
    }
}
class PremiumLoan extends  Loan {
    @Override
    public double getInterestRate() {
        return 12;
    }
    @Override
    public double calculatInterest(int months) {
        return months * getInterestRate();
    }
}

class VIPLoan extends Loan {
    @Override
    public double getInterestRate() {
        return 10;
    }
    @Override
    public double calculatInterest(int months) {
        return months * getInterestRate();
    }
}
