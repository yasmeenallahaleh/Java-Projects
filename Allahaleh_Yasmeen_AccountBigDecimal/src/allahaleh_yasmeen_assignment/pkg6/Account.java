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

public class Account {
    
       //The class varable to store the balance
       double balance;
    
       //This constructor holds the balance inputted
       // in the parameter
       public Account(double balance)
       {
           this.balance = balance;
       }
       
       //This outputs the balance in the console
       public void balanceOutput(){
           System.out.printf("Your balance is: $%.2f%n", balance);
       }
       
       //This allows the user to enter a amount
       //they want to deposit and returns that amount
       public double depositNum(double amount)
       {
           Scanner input = new Scanner(System.in);
           System.out.print("Enter a deposit amount for Big Decimal: ");
           amount = input.nextDouble();
          
           return amount;
       }
       
       //This adds the amount to the stored balance
       public void addDeposit(double amount)
       {
           balance += amount;
         
       }
       
       //This outputs the final balance and the
       //amount desposited in the account
       public void output(double amount)
       {
           
           System.out.printf("Your balance: $%.2f%nYour deposited amount: $%.2f%n", balance, amount);
           
       }
    
}
