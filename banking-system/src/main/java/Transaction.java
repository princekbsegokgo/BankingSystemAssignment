import java.util.Date;

public class Transaction {
    private String transactionID;
    private Date date;
    private double amount;
    private String type;

    public Transaction(String transactionID, Date date, double amount, String type) {
        this.transactionID = transactionID;
        this.date = date;
        this.amount = amount;
        this.type = type;
    }

    public void recordTransaction() {
        System.out.println("Transaction recorded: " + transactionID + " - " + type + " of " + amount);
    }
}
