/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allahaleh_yasmeen_assignment.pkg6;

import java.util.Scanner;
/**
 *
 * @author YasmeenAllahaleh
 */
//PROGRAMMER DOCUMENTATION FILE:

//Programmer Name: Yasmeen Allahaleh
//Assignment Start: 1/27/2024 3:52 p.m.
//Assignment Completion: 5:41 p.m.
//Total Hours for Assignment: 1 Hr 49 Minutes
//Comments: This project was someone fun, but difficult when I first started it. 
//I could grasp the topic of class and objects at first, but understood
//as I just went forth and just started writing code.
//It was weird working in a different class file and going have to
//switch back and forth as we didn't really have two seperate
//files in CIS5: C++, but I overall enjoyed it.

public class Allahaleh_Yasmeen_AccountBigDecimal {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Stores the amount deposited
        double amount = 0;
        
        //Creates an object with a stored balance
        Account BigDecimal = new Account(20.00);

        //Outputs the current balance
        BigDecimal.balanceOutput();
        
        //Allows the amount deposited to be stored
        //in the variable 
        amount = BigDecimal.depositNum(amount);
        
        //This adds the deposit amount to the balance
        BigDecimal.addDeposit(amount);
        
        //Outputs the final balanced
        // and amount deposited
        BigDecimal.output(amount);
        
        
        
        
    }
    
    
}
