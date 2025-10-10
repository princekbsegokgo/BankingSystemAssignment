import java.util.*;
public class Customer {
    private String customerId;
    private String name;
    private List<Account> accounts = new ArrayList<>();
    
    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }
    
    public void addAccount(Account account) {
        accounts.add(account);
    }
    
    public List<Account> getAccounts() { return accounts; }
    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
}