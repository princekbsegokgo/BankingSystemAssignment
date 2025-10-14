import java.util.Date;
public class Transaction {
    private String transactionId;
    private Date date;
    private double amount;
    private String type;
    private String accountNumber;
    
    public Transaction(String transactionId, double amount, String type, String accountNumber) {
        this.transactionId = transactionId;
        this.date = new Date();
        this.amount = amount;
        this.type = type;
        this.accountNumber = accountNumber;
    }
    
    public void printTransaction() {
        System.out.println(type + ": P" + amount + " on account " + accountNumber);
    }
    
    public String getTransactionId() { return transactionId; }
    public Date getDate() { return date; }
    public double getAmount() { return amount; }
    public String getType() { return type; }
}