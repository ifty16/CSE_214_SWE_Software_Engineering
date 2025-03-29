public abstract class Savings{

    public abstract double getInterestRate();
    public abstract double calculatInterest(int months);
    
   
}

class RegularSavings extends Savings {
    @Override
    public double getInterestRate() {
        return 2.5;
    }
    @Override
    public double calculatInterest(int months) {
        return months * getInterestRate();
    }
}

class PremiumSavings extends Savings {
    @Override
    public double getInterestRate() {
        return 3.5;
    }
    @Override
    public double calculatInterest(int months) {
        return months * getInterestRate();
    }
}

class VIPSavings extends Savings {
    @Override
    public double  getInterestRate() {
        return 5;
    }
    @Override
    public double calculatInterest(int months) {
        return months * getInterestRate();
    }
}