package Payroll;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;


    public BasePlusCommissionEmployee(double grossSales, double commissionRate, double baseSalary) {
        super(grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }


    public double getBaseSalary() {

        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calSalary(){
        ;
        return baseSalary + (getGrossSales() * getCommissionRate());
    }
}
