package Payroll;

public class HourlyEmployee extends Employee{

    private double wage;
    private double hours;

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void display(){
        System.out.println("\tHourly Wage :$" + wage);
        System.out.println("\tHours Worked : " + hours);
        System.out.println("\n\tEmployee's Actual Pay:$" + (wage * hours));
    }
}
