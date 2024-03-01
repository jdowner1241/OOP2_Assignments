package creditsolution;
/*
Module 1
Assignment 1

Program: Credit Solution
Group Members:
    Jamario Downer      -   2201011535
    Rickcolet Benjamin  -   2201010382
    Camoy Edwards       -   2201011768
    Shemar Campbell     -   2201011901
    Saphia Cothrel      –   2201013551
*/
public class Card{

    private int cardNumber;
    private double balance;
    private int pin;
    private boolean status;

    public Card(){};

    public Card(int newCardNumber, double newBalance, int newPin, boolean newStatus) {
        this.cardNumber = newCardNumber;
        this.balance = newBalance;
        this.pin = newPin;
        this.status = newStatus;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() { return pin; }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus(){
        return status;
    }
    public void display(){
        System.out.println("\n\tClient Card information");
        System.out.println("\tCard Number: "+getCardNumber());
        System.out.printf("\tCard Balance: $%,.2f%n", getBalance());
        System.out.println("\tPin:  "+getPin());
        System.out.println("\tCard Status: "+getStatus());
    }
}
