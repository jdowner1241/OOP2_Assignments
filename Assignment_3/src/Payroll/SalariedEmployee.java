package Payroll;

public class SalariedEmployee extends Employee{

    private double weeklySalary;


    private double weeksWorked;

    public SalariedEmployee(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public double getWeeksWorked() {
        return weeksWorked;
    }

    public void setWeeksWorked(double weeksWorked) {
        this.weeksWorked = weeksWorked;
    }

    public void display(){
        System.out.println("\tWeekly Salary :$" + weeklySalary);
        System.out.println("\tWeeks Worked : " + weeksWorked);
        System.out.println("\n\tEmployee's Actual Pay:$" + (weeklySalary * weeksWorked));
    }

}
