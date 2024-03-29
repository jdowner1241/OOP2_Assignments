import Payroll.*;

import java.util.Scanner;

/*
Module 3
Assignment 3

Program: Payroll
Group Members:
    Jamario Downer      -   2201011535
    Rickcolet Benjamin  -   2201010382
    Camoy Edwards       -   2201011768
    Shemar Campbell     -   2201011901
    Saphia Cothrel      –   2201013551
*/
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int eSelection;
        int iSelection;
        int tSelection;

        System.out.println("\n\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\tPayroll Management System");
        System.out.println("\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Employee data
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Jamario", "Downer", "JAD1111");
        employees[1] = new Employee("Saphia", "Cothrel", "SCF3333");
        employees[2] = new Employee("Rickcolet", "Benjamin", "RBF4444");
        employees[3] = new Employee("Shemar", "Campbell", "SCM5555");
        employees[4] = new Employee("Camoy", "Edwards", "CEM7777");

        //Invoice data
        Invoice[] item = new Invoice[5];

        item[0] = new Invoice("A9000", "Asus Laptop", 60000);
        item[1] = new Invoice("S8800", "4k Smart Samsung Tv", 50000);
        item[2] = new Invoice("L7770", "Lg Android Phone", 45000);
        item[3] = new Invoice("H8880", "Hp Desktop", 62000);
        item[4] = new Invoice("P9000", "Sony PS5 Console", 70000);

        System.out.println("\n\t************************");
        System.out.println("\tEmployee Selection");
        System.out.println("\t************************");
        System.out.println("\tPlease select the current Employee:");
        for (int i = 0; i < 5; i++) {
            System.out.print("\t" + i + ") ");
            employees[i].displayName();
        }
        System.out.print("\tSelection: ");
        eSelection = scanner.nextInt();
        System.out.println("\n\t______________________");
        System.out.println("\t" + employees[eSelection].getFirstName() + " " + employees[eSelection].getLastName() + " was selected!!!");
        System.out.println("\t______________________");

        System.out.println("\n\t************************");
        System.out.println("\tEmployee type");
        System.out.println("\t************************");
        System.out.println("\tPlease Employee payment type: ");
        System.out.println("\t1) Commission");
        System.out.println("\t2) Hourly Pay");
        System.out.println("\t3) Salaried (weekly) Pay");
        System.out.print("\tSelection: ");
        tSelection = scanner.nextInt();


        switch (tSelection){
            case 1:
                System.out.println("\n\t______________________");
                System.out.println("\tCommission Employee was selected!!!");
                System.out.println("\t______________________");



                System.out.println("\n\tCommission Employee: ");

                System.out.println("\n\t************************");
                System.out.println("\tItem Selection");
                System.out.println("\t************************");
                System.out.println("\tPlease select a item from the list:");
                for (int j = 0; j < 5; j++) {
                    System.out.print("\t" + j + ") ");
                    item[j].displayName();
                }
                System.out.print("\tSelection: ");
                iSelection = scanner.nextInt();
                System.out.print("\tHow much items was purchased: ");
                item[iSelection].setQuantity(scanner.nextInt());
                System.out.println("\n\t______________________");
                System.out.println("\t" + item[iSelection].getPartDescription() + " was selected!!!");
                System.out.println("\t______________________");

                System.out.println("\tTotal item Cost :$" + item[iSelection].calItemCost());

                CommissionEmployee commission = new CommissionEmployee(item[iSelection].calItemCost(), 10);
                BasePlusCommissionEmployee cBaseSalary = new BasePlusCommissionEmployee( commission.getGrossSales(), commission.getCommissionRate(), 30000);

                item[iSelection].setContent();
                item[iSelection].writeToFile();

                System.out.println("\n\t************************");
                System.out.println("\tCommission Payment information");
                System.out.println("\t************************");
                cBaseSalary.display();
                System.out.println("\t************************");

                cBaseSalary.setFirstName(employees[eSelection].getFirstName());
                cBaseSalary.setLastName(employees[eSelection].getLastName());
                cBaseSalary.setSocialSecurityNumber(employees[eSelection].getSocialSecurityNumber());
                cBaseSalary.setContent();
                cBaseSalary.adjustContent();
                cBaseSalary.writeToFile();

                break;
            case 2:
                System.out.println("\n\t______________________");
                System.out.println("\tHourly Employee was selected!!!");
                System.out.println("\t______________________");

                System.out.println("\n\tHourly Employee: ");

                System.out.print("\tHow much hours was worked: ");
                double hours = scanner.nextDouble();
                //hourly pay standard is set to $500 per hour
                HourlyEmployee hEmployee = new HourlyEmployee(500, hours);

                System.out.println("\n\t************************");
                System.out.println("\tHourly Payment information");
                System.out.println("\t************************");
                hEmployee.display();
                System.out.println("\t************************");

                hEmployee.setFirstName(employees[eSelection].getFirstName());
                hEmployee.setLastName(employees[eSelection].getLastName());
                hEmployee.setSocialSecurityNumber(employees[eSelection].getSocialSecurityNumber());
                hEmployee.setContent();
                hEmployee.adjustContent();
                hEmployee.writeToFile();

                break;
            case 3:
                System.out.println("\n\t______________________");
                System.out.println("\tSalaried Employee was selected!!!");
                System.out.println("\t______________________");

                System.out.println("\n\tSalaried (weekly) Employee: ");
                System.out.print("\tHow much weeks was worked: ");
                double weeks = scanner.nextDouble();
                //Weekly pay is 15000
                SalariedEmployee sEmployee = new SalariedEmployee(15000, weeks);

                System.out.println("\n\t************************");
                System.out.println("\tSalaried Payment information");
                System.out.println("\t************************");
                sEmployee.display();
                System.out.println("\t************************");

                sEmployee.setFirstName(employees[eSelection].getFirstName());
                sEmployee.setLastName(employees[eSelection].getLastName());
                sEmployee.setSocialSecurityNumber(employees[eSelection].getSocialSecurityNumber());
                sEmployee.setContent();
                sEmployee.adjustContent();
                sEmployee.writeToFile();

                break;
            default:
                throw new IllegalStateException("Unexpected value: " + tSelection);
        }


    }
}