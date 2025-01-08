/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg1;

/**
 *
 * @author Yasmeen Allahaleh
 */

import java.util.Scanner;

public class HW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 
        
        //Asks the user to input the information
        System.out.println("Enter a Month");
        String month = input.nextLine(); 
        
        System.out.println("Enter a Year");
        int year = input.nextInt();
        
        System.out.println("Enter the total collected");
        double total = input.nextDouble();
         
        //Varaibles created to calculate the tax
        double countyTax = total * 0.031;
        double stateTax = total * 0.0675;
        double totalTax = total * 0.0985;
        double sales = total/1.0985;
        
        //Prints out the format when for the caluclations, month, and year
        System.out.printf("Month: %s %d%n", month, year);
        System.out.printf("------------------------%n");
        System.out.printf("Total Collected:        $ %f%n", total);
        System.out.printf("Sales:                  $ %f%n", sales);
        System.out.printf("County Sales Tax:       $ %f%n", countyTax);
        System.out.printf("State Sales Tax:        $ %f%n", stateTax);
        System.out.printf("Total Sales Tax:        $ %f%n", totalTax);  
        
    }
    
}
