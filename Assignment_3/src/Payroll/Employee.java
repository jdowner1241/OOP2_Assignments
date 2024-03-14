package Payroll;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee implements Payable {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double _PaymentAmount;
    private String content;

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

    public void setContent() {
        LocalDate date;
        date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String formattedDate = date.format(formatter);

        this.content = ("\n\n\t************************************************************************" +
                "\n\tEmployee Payment Info" +
                "\n\t************************" +
                "\n\tName : " + firstName + " " + lastName +
                "\n\tSocial Security Number : " + socialSecurityNumber +
                "\n\tEmployee Payed on " + formattedDate +
                "\n\t______________________"
        );
    }
    public void setContent(String newContent, String employeeType) {
        this.content = (this.content +
                "\n\tEmployee Type : " + employeeType + newContent +
                "\n\t____________________________________________________________________"
        );
    }

    public String getContent() {
        return content;
    }


    @Override
    public double getPaymentAmount() {
        return _PaymentAmount;
    }

    public void set_PaymentAmount(double _PaymentAmount) {
        this._PaymentAmount = _PaymentAmount;
    }

    @Override
    public void writeToFile() {

        try {
            File receipt = new File("paystub.txt");

            boolean isCreated = receipt.createNewFile();
            if (isCreated) {
                System.out.println("\n\t______________________");
                System.out.println("\tFile called " + receipt + " was created successfully");
                System.out.println("\n\t______________________");
                writeToFile();
            } else {
                System.out.println("\n\t______________________");
                System.out.println("\t" + receipt + " will be updated instead shortly...");

                //Write to file when file exist
                BufferedWriter writer = new BufferedWriter(new FileWriter(receipt, true));
                writer.write(content);
                writer.close();

                System.out.println("\t" + receipt + " updated successfully!!!");
                System.out.println("\t______________________");
            }

        } catch (IOException e) {
            System.out.println("Exception occurred trying to create file: ");
            e.printStackTrace();
        }

    }


    public void displayName() {
        System.out.println(" Name: " + firstName + " " + lastName);
    }

}



