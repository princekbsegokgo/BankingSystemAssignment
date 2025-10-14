public class BankManagementSystem {
    private String bankName;
    private String branch;
    private String location;

    public BankManagementSystem(String bankName, String branch, String location) {
        this.bankName = bankName;
        this.branch = branch;
        this.location = location;
    }

    public void openAccount() {
        System.out.println("Account opened successfully.");
    }

    public void closeAccount() {
        System.out.println("Account closed successfully.");
    }

    public void login() {
        System.out.println("Login successful.");
    }

    public void logout() {
        System.out.println("Logout successful.");
    }
}
