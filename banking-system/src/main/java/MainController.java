package controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.*;

import java.util.ArrayList;

public class MainController {

    // Tab 1 - Register
    @FXML private TextField txtFirstName, txtLastName, txtAddress, txtCustomerId;

    // Tab 2 - Open Account
    @FXML private TextField txtAccountNumber, txtDeposit, txtBranch;
    @FXML private ComboBox<String> cmbAccountType;

    // Tab 3 - Transactions
    @FXML private TextField txtTransAccount, txtAmount;

    // Tab 4 - Table
    @FXML private TableView<Account> tblAccounts;

    private Customer customer;
    private ArrayList<Account> accounts = new ArrayList<>();

    @FXML
    private void initialize() {
        cmbAccountType.getItems().addAll("Savings", "Investment", "Cheque");
    }

    @FXML
    private void handleRegisterCustomer() {
        customer = new Customer(
                txtCustomerId.getText(),
                txtFirstName.getText(),
                txtLastName.getText(),
                txtAddress.getText()
        );
        showAlert("Customer Registered", "Customer created successfully!");
    }

    @FXML
    private void handleOpenAccount() {
        if (customer == null) {
            showAlert("Error", "Please register a customer first.");
            return;
        }

        String type = cmbAccountType.getValue();
        String accNum = txtAccountNumber.getText();
        double amount = Double.parseDouble(txtDeposit.getText());
        String branch = txtBranch.getText();

        Account acc;
        switch (type) {
            case "Savings" -> acc = new SavingsAccount(accNum, amount, branch);
            case "Investment" -> acc = new InvestmentAccount(accNum, amount, branch);
            case "Cheque" -> acc = new ChequeAccount(accNum, amount, branch, "Employer", "Address");
            default -> { showAlert("Error", "Invalid account type"); return; }
        }

        customer.addAccount(acc);
        accounts.add(acc);
        showAlert("Account Created", "New " + type + " account added!");
    }

    @FXML
    private void handleDeposit() {
        String accNum = txtTransAccount.getText();
        double amount = Double.parseDouble(txtAmount.getText());

        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accNum)) {
                acc.deposit(amount);
                showAlert("Deposit Successful", "Deposited " + amount + " into account " + accNum);
                return;
            }
        }
        showAlert("Error", "Account not found!");
    }

    @FXML
    private void handleWithdraw() {
        String accNum = txtTransAccount.getText();
        double amount = Double.parseDouble(txtAmount.getText());

        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accNum)) {
                acc.withdraw(amount);
                showAlert("Withdrawal Successful", "Withdrawn " + amount + " from account " + accNum);
                return;
            }
        }
        showAlert("Error", "Account not found!");
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
