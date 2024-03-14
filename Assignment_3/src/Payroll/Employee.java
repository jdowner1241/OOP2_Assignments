package Payroll;

public class Employee implements Payable{

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double _PaymentAmount;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double getPaymentAmount() {
        return _PaymentAmount;
    }

    @Override
    public void writeToFile() {

    }

    public void displayName(){
        System.out.println(" Name: " + firstName + " " + lastName);
    }

    public void displayPayment(){

    }

}
