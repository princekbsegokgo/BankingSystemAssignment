public class InvestmentAccount extends Account {
    public InvestmentAccount(String accountNumber, double balance) {
        super(accountNumber, Math.max(balance, 500.0));
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }
    
    public void calculateInterest() {
        balance += balance * 0.05;
    }
}