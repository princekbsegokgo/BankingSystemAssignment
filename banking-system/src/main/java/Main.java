public class Main {
    public static void main(String[] args) {
        // Create a customer
        Customer c1 = new Customer("C001", "Prince", "Segokgo", "Gaborone");

        // Create accounts
        SavingsAccount sa = new SavingsAccount("S001", 2000, "Main Branch");
        InvestmentAccount ia = new InvestmentAccount("I001", 5000, "Main Branch");
        ChequeAccount ca = new ChequeAccount("C002", 1500, "Main Branch", "ABC Ltd", "Gaborone");

        // Add accounts to customer
        c1.addAccount(sa);
        c1.addAccount(ia);
        c1.addAccount(ca);

        // Do some transactions
        sa.deposit(500);
        ia.withdraw(1000);
        ca.deposit(2000);

        // Calculate interest
        sa.calculateInterest();
        ia.calculateInterest();
        ca.calculateInterest();

        // Check balances
        System.out.println("Savings balance: " + sa.getBalance());
        System.out.println("Investment balance: " + ia.getBalance());
        System.out.println("Cheque balance: " + ca.getBalance());
    }
}
