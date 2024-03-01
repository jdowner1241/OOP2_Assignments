package Payrollmanagement;

// StaffMember class
public class StaffMember {
    private String firstname;
    private String lastname;
    private String deptNumber;
    private double hoursWorked;

    // Constructor
    public StaffMember(){}
    public StaffMember(String firstname, String lastname, String deptNumber, double hoursWorked) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.deptNumber = deptNumber;
        this.hoursWorked = hoursWorked;
    }

    // Getters and Setters
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDeptNumber() {
        return deptNumber;
    }

    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Display method
    public void display() {
        System.out.println("Firstname: " + firstname);
        System.out.println("Lastname: " + lastname);
        System.out.println("Department Number: " + deptNumber);
        System.out.println("Hours Worked: " + hoursWorked);

    }
}
