public class Individual extends Customer {
    private String idNumber;
    
    public Individual(String customerId, String firstName, String lastName, String address, String idNumber) {
        super(customerId, firstName, lastName, address);
        this.idNumber = idNumber;
    }
    
    public String getIdNumber() { return idNumber; }
}