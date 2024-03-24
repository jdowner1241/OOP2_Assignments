
//*
//Module 4
//Assignment 4
//
//Program: Payroll
//Group Members:
//Jamario Downer      -   2201011535
//Rickcolet Benjamin  -   2201010382
//Camoy Edwards       -   2201011768
//Shemar Campbell     -   2201011901
//Saphia Cothrel      –   2201013551

//        */
import OOP4_JamarioD.CurrencyConverter;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        CurrencyConverter start = new CurrencyConverter();
        JFrame frame = new JFrame("Currency Converter");
        frame.setContentPane(start.getMainForm());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}