package Payroll;

public class HourlyEmployee extends Employee{

    private double wage;
    private double hours;


    public HourlyEmployee( double wage, double hours){
        this.wage = wage;
        this.hours = hours;

        double payment = (wage * hours);
        super.set_PaymentAmount(payment);
    }

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


    public void adjustContent(){

        String adjustedContent = ("\n\n\tHourly Payment information:" +
                "\n\tHourly Wage : $" + wage +
                "\n\tHours Worked : " + hours +
                "\n\tEmployee's Actual Pay : $" + (wage * hours) +
                "\n\tEmployee Payment : $" + getPaymentAmount()
        );

        super.setContent(adjustedContent, "Hourly Employee");
    }

    public void display(){
        System.out.println("\tHourly Wage :$" + wage);
        System.out.println("\tHours Worked : " + hours);
        System.out.println("\n\tEmployee's Actual Pay:$" + (wage * hours));
    }
}
