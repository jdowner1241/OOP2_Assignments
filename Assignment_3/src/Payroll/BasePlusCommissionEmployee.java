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

    public void display(){
        System.out.println("\tGross rate :" + getCommissionRate() + "%");
        System.out.println("\tGross Sale :$" + (getGrossSales() * getCommissionRate()));
        System.out.println("\tBase pay :$" + baseSalary);
        System.out.println("\n\tEmployee's Actual Pay:$" + (baseSalary +(getGrossSales() * (getCommissionRate() / 100))));
    }
}
