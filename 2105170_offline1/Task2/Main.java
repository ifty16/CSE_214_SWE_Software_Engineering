public class Main {
    public static void main(String[] args) {
        
        AbstractFactory factory = new RegularFactory();
        System.out.println("Regular Account:");
        Loan loan = factory.getLoan();
        Savings savings = factory.getSavings();
        System.out.println("Loan Interest Rate: " + loan.getInterestRate());
        System.out.println("Loan Interest: " + loan.calculatInterest(12));
        System.out.println("Savings Interest Rate: " + savings.getInterestRate());
        System.out.println("Savings Interest: " + savings.calculatInterest(12));


        factory = new PremiumFactory();
        loan = factory.getLoan();
        savings = factory.getSavings();
        System.out.println("Premium Account:");
        System.out.println("Loan Interest Rate: " + loan.getInterestRate());
        System.out.println("Loan Interest: " + loan.calculatInterest(12));
        System.out.println("Savings Interest Rate: " + savings.getInterestRate());
        System.out.println("Savings Interest: " + savings.calculatInterest(12));

        factory = new VIPFactory();
        loan = factory.getLoan();
        savings = factory.getSavings();
        System.out.println("VIP Account:");
        System.out.println("Loan Interest Rate: " + loan.getInterestRate());
        System.out.println("Loan Interest: " + loan.calculatInterest(12));
        System.out.println("Savings Interest Rate: " + savings.getInterestRate());
        System.out.println("Savings Interest: " + savings.calculatInterest(12));

    }
}
