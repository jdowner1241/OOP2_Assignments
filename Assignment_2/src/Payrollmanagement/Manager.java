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



package Payrollmanagement;

// Manager class
public class Manager extends StaffMember {
    private double bonus;

    // Constructor
    public Manager (){};
    public Manager(String firstname, String lastname, String deptNumber, double hoursWorked, double bonus) {
        super(firstname, lastname, deptNumber, hoursWorked);
        this.bonus = bonus;
    }

    public Manager(String firstname, String lastname, String deptNumber, double hoursWorked) {
        super(firstname, lastname, deptNumber, hoursWorked);
    }


    // Getter and Setter for bonus
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Override display method
    @Override
    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
    }
}


