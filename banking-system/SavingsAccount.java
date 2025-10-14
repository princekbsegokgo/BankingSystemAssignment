public class SavingsAccount extends Account implements InterestBearing {
    private double interestRate = 0.0005;
    
    public SavingsAccount(String accountNumber, double balance, String branch) {
        super(accountNumber, balance, branch);
    }
    
    @Override
    public void withdraw(double amount) {
        System.out.println("Cannot withdraw from Savings account");
    }
    
    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: P" + interest);
    }
    
    @Override
    public double getInterestRate() { return interestRate; }
}