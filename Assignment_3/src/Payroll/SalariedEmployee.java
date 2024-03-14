package Payroll;

public class SalariedEmployee extends Employee{

    private double weeklySalary;

    private double weeksWorked;

    public SalariedEmployee(double weeklySalary, double weeksWorked) {
        this.weeklySalary = weeklySalary;
        this.weeksWorked = weeksWorked;

        double payment = (weeklySalary * weeksWorked);
        super.set_PaymentAmount(payment);
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


    public void adjustContent(){

        String adjustedContent = ("\n\n\tSalaried Payment information: " +
                "\n\tWeekly Salary :$" + weeklySalary +
                "\n\tWeeks Worked : " + weeksWorked +
                "\n\tEmployee's Actual Pay:$" + (weeklySalary * weeksWorked) +
                "\n\tEmployee Payment: $" + getPaymentAmount()
        );

        super.setContent(adjustedContent, "Salaried Employee");
    }

    public void display(){
        System.out.println("\tWeekly Salary :$" + weeklySalary);
        System.out.println("\tWeeks Worked : " + weeksWorked);
        System.out.println("\n\tEmployee's Actual Pay:$" + (weeklySalary * weeksWorked));
    }

}
