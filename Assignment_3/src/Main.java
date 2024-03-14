import Payroll.Employee;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t++++++++++++++++++++++++");
        System.out.println("\tPayroll Management System");
        System.out.println("\t++++++++++++++++++++++++");

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Jamario", "Downer", "JAD1111");
        employees[1] = new Employee("Saphia", "Cothrel", "SCF3333");
        employees[2] = new Employee("Rickcolet", "Benjamin", "RBF4444");
        employees[3] = new Employee("Shemar", "Campbell", "SCM5555");
        employees[4] = new Employee("Camoy", "Edwards", "CEM7777");

        System.out.println("\t************************");
        System.out.println("\n\t Employee Selection");
        System.out.println("\t************************");
        System.out.println("\tPlease select the a Employee?");



    }
}