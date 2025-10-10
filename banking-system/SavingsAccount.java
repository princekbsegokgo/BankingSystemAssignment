public class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    
    @Override
    public void withdraw(double amount) {
    }
    
    public void calculateInterest() {
        balance += balance * 0.0005;
    }
}