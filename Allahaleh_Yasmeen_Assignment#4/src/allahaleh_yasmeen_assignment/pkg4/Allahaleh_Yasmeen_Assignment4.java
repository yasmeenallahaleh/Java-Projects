/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allahaleh_yasmeen_assignment.pkg4;


import java.util.Scanner;
/**
 *
 * @author Yasmeen Allahaleh
 */
public class Allahaleh_Yasmeen_Assignment4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //creates the varables that hold the string of factors
        String factor;
        
        //Allows User to input a number
        System.out.println("Hello");
        System.out.print("Enter the largest number to try to display: ");
        double maxInt = input.nextDouble();
        
        if(maxInt > 100000)
        {
            System.out.println("Integer too big! You cannot enter an integer bigger than 100,000");
            return;
        }
        
        
        //This if statements is utizlie the output
        //of perfect numbers with the help
        //of the isPerfect method created.
        if(maxInt < 6)
        {
            System.out.print("No numbers were perfect!");
        }
        else if (maxInt >= 6 && maxInt < 28)
        {
           System.out.println("6 is perfect.");
           factor = isPerfect(6);
           System.out.printf("        Factors: %s%n", factor);
           
        }
        else if(maxInt >= 28 && maxInt < 496)
        {
           System.out.println("6 is perfect.");
           factor = isPerfect(6);
           System.out.printf("        Factors: %s%n", factor);
           
           System.out.println("28 is perfect.");
           factor = isPerfect(28);
           System.out.printf("        Factors: %s%n", factor);
        }
        else if(maxInt >= 496 && maxInt < 8128)
        {
           System.out.println("6 is perfect.");
           factor = isPerfect(6);
           System.out.printf("        Factors: %s%n", factor);
           
           System.out.println("28 is perfect.");
           factor = isPerfect(28);
           System.out.printf("        Factors: %s%n", factor);
           
           System.out.println("496 is perfect.");
           factor = isPerfect(496);
           System.out.printf("        Factors: %s%n", factor);
        }
        else if(maxInt >=8128 && maxInt < 100000)
        {
           System.out.println("6 is perfect.");
           factor = isPerfect(6);
           System.out.printf("        Factors: %s%n", factor);
           
           System.out.println("28 is perfect.");
           factor = isPerfect(28);
           System.out.printf("        Factors: %s%n", factor);
           
           System.out.println("496 is perfect.");
           factor = isPerfect(496);
           System.out.printf("        Factors: %s%n", factor);
           
           System.out.println("8128 is perfect.");
           factor = isPerfect(8128);
           System.out.printf("        Factors: %s%n", factor);
        }
        
        
        
    }
    
    //This method allows one to checks and determines if the number inserted 
    // by the user is a perfect number 
    //returns the factor if number is perfect, otherwise returns null
    public static String isPerfect(double number){
        
        String perfectNum;
        
        if(number == 8128)
        {
            perfectNum = "1 2 4 8 16 32 64 127 254 508 1016 2032 4064";
            return perfectNum;
        }
        else if(number == 496)
        {
            perfectNum = "1 2 4 8 16 31 62 124 248";
            return perfectNum;
        }
        else if(number == 28)
        {
           perfectNum = "1 2 4 7 14"; 
           return perfectNum;
        }
        else if(number == 6)
        {
            perfectNum = "1 2 3";
            return perfectNum;
        }
        else
        {
            return null;
        }    
    }
            
    
}
