/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allahaleh_yasmeen_assignment3;

import java.util.Scanner;

/**
 *
 * @author jamalelhaleyih
 */
public class Allahaleh_Yasmeen_Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creates Scanner
        Scanner input = new Scanner(System.in);
        
        //Allows the user to identify the number of days wanted
        System.out.print("For how many days will the pay double?");
        int numDay = input.nextInt();
        
        //This if statement check and allows the forloop
        //to excute if the number is in between 1 and 45 included.
        if(numDay < 1 || numDay > 45)
        {
            System.out.printf("%d was not a valid entry%n", numDay);
        }
        else 
        {
            //Sets up the displayed output
            System.out.println("Day          Total Pay");
            System.out.println("---------------------------------");
            
            //Varables to store the doubled pay, pay, and 
            //the sume of all pay, total.
            double pay = 0.01;
            double total = 0;
            
            //This for loop repleatly doubles pay, adds total, and prints out the 
            //Doubled pay each day until it reaches the limit of days
            //entered by the user
            for(int i = 0; i < numDay; i++)
            {
               //I created this if statemnt because everyday the days
               //would become double digits it would mess up with the spacing
               // of the dollar sign.
               if(i + 1 < 10)
               {
                   //display for single digit days
                  System.out.printf("%d            $          %.2f%n", i + 1, pay);  
               }
               else
               {
                   //display for double digit days
                  System.out.printf("%d           $          %.2f%n", i + 1, pay); 
               }
               
               //Calculates the net double pay and thesum of all doubled pays    
               total = total + pay;
               pay = pay * 2;
            }
            
            //prints out the total of al the pays together
            System.out.println("---------------------------------");
            System.out.printf("Total        $          %.2f", total);
            
        }
                
        
    }
    
}
