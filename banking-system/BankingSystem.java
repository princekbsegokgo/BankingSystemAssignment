import java.util.*;
public class BankingSystem {
    private List<Customer> customers = new ArrayList<>();
    
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        
        Customer john = new Customer("C001", "John Doe");
        SavingsAccount savings = new SavingsAccount("SA001", 1000);
        InvestmentAccount investment = new InvestmentAccount("IA001", 600);
        
        john.addAccount(savings);
        john.addAccount(investment);
        bank.customers.add(john);
        
        savings.deposit(500);
        investment.withdraw(100);
        
        System.out.println("Savings Balance: " + savings.getBalance());
        System.out.println("Investment Balance: " + investment.getBalance());
        System.out.println("SUCCESS! Banking system is working.");
    }
}