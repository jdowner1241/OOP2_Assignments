package Payrollmanagement;

// SalesRep class
public class SalesRep extends StaffMember {
    private double allowance;

    // Constructor

    public SalesRep(){}
    public SalesRep(String firstname, String lastname, String deptNumber, double hoursWorked, double allowance) {
        super(firstname, lastname, deptNumber, hoursWorked);
        this.allowance = allowance;
    }

    // Getter and Setter for allowance
    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    // Override display method
    @Override
    public void display() {
        super.display();
        System.out.println("Allowance: " + allowance);
    }
    }