cat > ChequeAccount.java << 'EOF'
public class ChequeAccount extends Account {
    private String employerName;
    private String employerAddress;
    
    public ChequeAccount(String accountNumber, double balance, String employerName, String employerAddress) {
        super(accountNumber, balance);
        this.employerName = employerName;
        this.employerAddress = employerAddress;
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }
    
    public void calculateInterest() {
    }
    
    public String getEmployerName() { return employerName; }
    public String getEmployerAddress() { return employerAddress; }
}
EOF