public class Company extends Customer {
    private String registrationNumber;
    private String companyName;
    
    public Company(String customerId, String firstName, String lastName, String address, 
                  String registrationNumber, String companyName) {
        super(customerId, firstName, lastName, address);
        this.registrationNumber = registrationNumber;
        this.companyName = companyName;
    }
    
    public String getRegistrationNumber() { return registrationNumber; }
    public String getCompanyName() { return companyName; }
}