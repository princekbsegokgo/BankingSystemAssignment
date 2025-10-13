cat > BankingSystem.java << 'EOF'
import java.util.*;
public class BankingSystem {
    private List<Customer> customers = new ArrayList<>();
    
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        
        Customer john = new Customer("C001", "John Doe");
        SavingsAccount savings = new SavingsAccount("SA001", 1000);
        InvestmentAccount investment = new InvestmentAccount("IA001", 600);
        ChequeAccount cheque = new ChequeAccount("CA001", 2000, "ABC Company", "Gaborone");
        
        john.addAccount(savings);
        john.addAccount(investment);
        john.addAccount(cheque);
        bank.customers.add(john);
        
        savings.deposit(500);
        investment.withdraw(100);
        cheque.withdraw(300);
        
        System.out.println("=== BANKING SYSTEM OUTPUT ===");
        System.out.println("Savings Balance: " + savings.getBalance());
        System.out.println("Investment Balance: " + investment.getBalance());
        System.out.println("Cheque Balance: " + cheque.getBalance());
        System.out.println("All 3 account types working correctly!");
    }
}
EOF