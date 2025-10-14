import java.util.ArrayList;

public class Customer {
    private String customerId;
    private String firstName;
    private String lastName;
    private String address;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Customer(String customerId, String firstName, String lastName, String address) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
