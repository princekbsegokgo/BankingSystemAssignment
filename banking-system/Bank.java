import java.util.*;
public class Bank {
    private String bankName;
    private List<Customer> customers;
    private List<Account> accounts;
    
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }
    
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    
    public Customer findCustomer(String customerId) {
        for (Customer c : customers) {
            if (c.getCustomerId().equals(customerId)) {
                return c;
            }
        }
        return null;
    }
    
    public String getBankName() { return bankName; }
    public List<Customer> getCustomers() { return customers; }
}