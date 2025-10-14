public class InvestmentAccount extends Account implements InterestBearing, Transferable {
    private double interestRate = 0.05;
    
    public InvestmentAccount(String accountNumber, double balance, String branch) {
        super(accountNumber, Math.max(balance, 500.0), branch);
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: P" + amount);
        }
    }
    
    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: P" + interest);
    }
    
    @Override
    public double getInterestRate() { return interestRate; }
    
    @Override
    public void transfer(double amount, Account targetAccount) {
        if (amount <= balance && amount <= getTransferLimit()) {
            balance -= amount;
            targetAccount.deposit(amount);
            System.out.println("Transferred P" + amount + " to " + targetAccount.getAccountNumber());
        }
    }
    
    @Override
    public double getTransferLimit() { return 10000.0; }
}