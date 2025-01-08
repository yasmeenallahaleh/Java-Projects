/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allahaleh_yasmeen_monthsdays;

import java.util.Scanner;


/**
 *
 * @author YasmeenAllahaleh
 */
/*
PROGRAMMER DOCUMENTATION FILE:
Programmer Name: Yasmeen Allahaleh
Assignment Start:01/28/2024:  1:42 p.m. - 3:18 p.m. (took a break)
Assignment Completion: 1/028/2024: (resumed at) 5:00 p.m. - 7:18 p.m.
Total Hours for Assignment: 2 Hr 54 Minutes
Comments: I have to admit that this assignment killed me.
A number of things were going wrong and had major trouble with 
dealing with the exceptions working properly. I felt like this assignment taught me A LOT and 
honestly think it improved my skills. If I were to do this assignment again,
I'd probably take way less time.
*/


public class Allahaleh_Yasmeen_MonthsDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //Asks for user input
        System.out.println("Enter the month (1=January, 2=February, ..., 12=December):");
        int month = input.nextInt();
        
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        //creates an object
        MonthDays x = new MonthDays(month, year);
        
        //Generates the number of days
        //based on user's input
        int days = x.getNumberOfDays();
        
        //Displays the number of days along with the date
        System.out.printf("%d/%d has %d days%n%n%n", month, year, days);
        
        
        //This demonstartes
        //catching the IllegalArgumentException
        try{
            System.out.print("Demonstarting catching the IllegalArgumentException . . .\n");
            x.validNum(-1, -1);
        }
        catch(IllegalArgumentException e){
            System.out.print("Your values are invalid . . .\n");
        }
        
    }
    
     
    
}
