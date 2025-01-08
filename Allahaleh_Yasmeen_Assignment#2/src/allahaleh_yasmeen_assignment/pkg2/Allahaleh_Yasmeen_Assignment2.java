/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allahaleh_yasmeen_assignment.pkg2;

import java.util.Scanner;

/**
 *
 * @author Yasmeen Allahaleh
 */
public class Allahaleh_Yasmeen_Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creates a scanner
        Scanner input = new Scanner(System.in);   
        
        //This allows the user to enter each integer
        System.out.print("Enter the first value: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the second value: ");
        int num2 = input.nextInt();
        
        System.out.print("Enter the third value: ");
        int num3 = input.nextInt();
        
        System.out.print("Enter the fourth value: ");
        int num4 = input.nextInt();
        
        //Creates the variable to store the max and min values
        int max = 0;
        int min = 0;
        
        //This if statetemnts allows one to determin which
        //value entered is the maximum value
        if (num1 > num2 && num1 > num3 && num1 > num4)
        {
            max = num1;
        }
        else if (num2 > num1 && num2 > num3 && num2 > num4)
        {
           max = num2; 
        }
        else if (num3 > num1 && num3 > num2 && num3 > num4)
        {
           max = num3; 
        }
        else if (num4 > num1 && num4 > num3 && num4 > num2)
        {
           max = num4; 
        }
        
        //This if statetemnts allows one to determin which
        //value entered is the minimum value
        if (num1 < num2 && num1 < num3 && num1 < num4)
        {
           min = num1;
        }
        else if (num2 < num1 && num2 < num3 && num2 < num4)
        {
           min = num2; 
        }
        else if (num3 < num1 && num3 < num2 && num3 < num4)
        {
           min = num3; 
        }
        else if (num4 < num1 && num4 < num3 && num4 < num2)
        {
           min = num4; 
        }
        
        //This outputs the nubers into the console
        System.out.printf("The values entered: %d, %d, %d, %d have a "
                + "minimum value of %d and a maximum value of %d", 
                num1, num2, num3, num4, min, max);
        
    }
    
}
