import Payrollmanagement.Manager;
import Payrollmanagement.SalesRep;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
     SalesRep sales1  =  new SalesRep() ;
     System.out.println(" Enter Sales rep Name");
    System.out.print("\tFirst Name: ");
    sales1.setFirstname(scanner.next());



     Manager management1 = new Manager("Oats", "Porridge","56",80,3600);

     management1.display();

     // just an example management1.setFirstname("Daffy");


     // another example
     //sales1.setFirstname(scanner.next());
     //System.out.printf(sales1.getFirstname());


    }
}