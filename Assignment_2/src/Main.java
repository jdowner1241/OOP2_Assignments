import Payrollmanagement.Manager;
import Payrollmanagement.SalesRep;
import Payrollmanagement.StaffMember;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SalesRep[] sales  =  new SalesRep[5];

        //int count = 0;
        System.out.println("\n+++++++++++++++++++++++++++++++\n ");

        for (int i = 0; i < 5; i++)
        {
            sales[i] = new SalesRep();
            System.out.println("\tEnter Sales rep: " + (i+1));
            System.out.print("\tFirst Name: ");
            sales[i].setFirstname(scanner.next());

            System.out.println("_____________________________________\n ");
        }

        System.out.println("\n\n^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("\tDisplay Info: ");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^\n");

        for (int j = 0; j < 5; j++)
        {
            sales[j].display();
            System.out.println("+++++++++++++++++++++++++++++++\n ");
        }




        //Manager management1 = new Manager("Oats", "Porridge","56",80,3600);

        // management1.display();

        // just an example management1.setFirstname("Daffy");


        // another example
        //sales1.setFirstname(scanner.next());
        //System.out.printf(sales1.getFirstname());


    }
}