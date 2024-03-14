package Payroll;

import java.io.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Invoice implements Payable
{

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    private double _PaymentAmount;
    private String content;

    public Invoice() {
    }

    public Invoice(String partNumber, String partDescription, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public void setContent() {
        LocalDate date;
        date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String formattedDate = date.format(formatter);


        this.content = ( "\n\n\t************************************************************************" +
                "\n\tItem Purchased Info" +
                "\n\t************************" +
                "\n\tPart Description : " + partDescription +
                "\n\tPart Number : " + partNumber +
                "\n\tPrice per Item : $" + pricePerItem +
                "\n\tQuantity : " + quantity +
                "\n\tTotal Item cost : $" + getPaymentAmount() +
                "\n\t______________________" +
                "\n\tItem purchased on " + formattedDate +
                "\n\t__________________________________________________________________"
        );
    }

    @Override
    public double getPaymentAmount() {

        _PaymentAmount = quantity * pricePerItem;
        return _PaymentAmount;
    }

    @Override
    public void writeToFile() {

        try {
            File receipt = new File("paystub.txt");

            boolean isCreated = receipt.createNewFile();
            if(isCreated){
                System.out.println("\n\t______________________");
                System.out.println("\tFile called " + receipt + " was created successfully");
                System.out.println("\n\t______________________");
                writeToFile();
            }else{
                System.out.println("\n\t______________________");
                System.out.println("\t" + receipt + " will be updated instead shortly...");

                //Write to file when file exist
                BufferedWriter writer = new BufferedWriter(new FileWriter(receipt, true ));
                writer.write(content);
                writer.close();

                System.out.println("\t" + receipt + " updated successfully!!!");
                System.out.println("\t______________________");
            }

        }catch (IOException e){
            System.out.println("Exception occurred trying to create file: ");
            e.printStackTrace();
        }

    }

    public double calItemCost() {

        return quantity * pricePerItem;
    }
    public void display(){

    }
    public void displayName(){
        System.out.println(" Item: " + partDescription + " Price: $" + pricePerItem);
    }
}
