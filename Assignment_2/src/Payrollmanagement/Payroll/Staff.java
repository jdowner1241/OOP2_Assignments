package Payrollmanagement.Payroll;


abstract class Staff {
    protected String name;
    protected int hoursWorked;
    public Staff(String name, int hoursWorked) {
        this.name = name;
        this.hoursWorked = hoursWorked;
    }          // Abstract method to calculate salarypublic abstract double calculateSalary(); }

    public abstract double calculateSalary();

    class Manager extends Staff {
        private double bonus;
        public Manager(String name, int hoursWorked, double bonus) {
            super(name, hoursWorked);
            this.bonus = bonus; }
        @Override
        public double calculateSalary() {
            return (hoursWorked * 2500) + bonus;     }
    }

    class SalesRep extends Staff {
        private double allowance;
        public SalesRep(String name, int hoursWorked, double allowance) {
            super(name, hoursWorked);
            this.allowance = allowance; }
        @Override
        public double calculateSalary() {
            return (hoursWorked * 1500) + allowance;  }
    }
}
