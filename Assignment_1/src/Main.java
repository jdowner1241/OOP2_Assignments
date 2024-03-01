/*
Module 1
Assignment 1

Program: Credit Solution
Group Members:
    Jamario Downer      -   2201011535
    Rickcolet Benjamin  -   2201010382
    Camoy Edwards       -   2201011768
    Shemar Campbell     -   2201011901
    Saphia Cothrel      –   2201013551
*/

import creditsolution.Client;
import creditsolution.Card;

import java.util.Scanner;

/*
Module 1
Assignment 1

Program: Credit Solution
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

        Client customer1 = new Client();


        Card card1 = new Card();

        System.out.println("\n\t++++++++++++++++++++++++");
        System.out.println("\tGet Info.");
        System.out.println("\t++++++++++++++++++++++++");
        System.out.println("\n\tEnter Client Card information.");
        System.out.print("\tCard Number: ");
        card1.setCardNumber(scanner.nextInt());
        System.out.print("\tCard Balance: ");
        card1.setBalance(scanner.nextDouble());
        System.out.print("\tCard Pin: ");
        card1.setPin(scanner.nextInt());
        card1.setPin(45678);
        System.out.print("\tCard Status (true/false): ");
        card1.setStatus(scanner.nextBoolean());
        card1.setStatus(true);


        System.out.println("\n\tPlease enter the following Client information.");
        System.out.print("\tFirst Name: ");
        customer1.setFirstName(scanner.next());
        System.out.print("\tLast Name: ");
        customer1.setLastName(scanner.next());
        System.out.print("\tAge: ");
        customer1.setAge(scanner.nextInt());
        System.out.print("\tId Number: ");
        customer1.setIdNumber(scanner.nextInt());
        customer1.setCard(card1);

        System.out.println("\n\t++++++++++++++++++++++++");
        System.out.println("\tDisplay Info.");
        System.out.println("\t++++++++++++++++++++++++");
        customer1.display();

        }
    }
