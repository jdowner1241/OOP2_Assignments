package Payroll;

public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

//    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
//        super(firstName, lastName, socialSecurityNumber);
//        this.grossSales = grossSales;
//        this.commissionRate = commissionRate;
//    }
    public CommissionEmployee(double grossSales, double commissionRate) {
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

}
