public abstract class Account {
    private String accountNumber;
    protected double balance;
    
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }
    
    public abstract void withdraw(double amount);
    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }

    public void calculateInterest() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateInterest'");
    }
}