public interface Transferable {
    void transfer(double amount, Account targetAccount);
    double getTransferLimit();
}