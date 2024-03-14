package Payroll;

import java.io.File;
import java.io.IOException;

public class Invoice implements Payable
{

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    private double _PaymentAmount;

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
