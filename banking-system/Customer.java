import java.util.*;
public abstract class Customer {
    protected String customerId;
    protected String firstName;
    protected String lastName;
    protected String address;
    protected List<Account> accounts;
    
    public Customer(String customerId, String firstName, String lastName, String address) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.accounts = new ArrayList<>();
    }
    
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account " + account.getAccountNumber() + " added to customer " + customerId);
    }
    
    public List<Account> getAccounts() { return accounts; }
    public String getCustomerId() { return customerId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getFullName() { return firstName + " " + lastName; }
}