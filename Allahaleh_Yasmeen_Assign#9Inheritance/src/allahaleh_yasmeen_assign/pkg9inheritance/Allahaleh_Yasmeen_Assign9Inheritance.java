/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allahaleh_yasmeen_assign.pkg9inheritance;

import java.util.Scanner;

/**
 *
 * @author YasmeenAllahaleh
 */
/*
PROGRAM DOC FILE ASSIGN #5
Programmer Name: Yasmeen Allahaleh
Assignment Start: 02/02/2024 12:50 p.m.
Assignment Completion: 02/02/2024 2:22 p.m.
Total Hours for Assignment: 1 hour 32 Minutes
Comments: I really enjoyed playing around with the inheritance as 
creating tha animal class. There are so many possibilities branching off of animals
so I just created an AquaticAnimal subclass since I really like the Aquatrium. 
*/

public class Allahaleh_Yasmeen_Assign9Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creates scanner object
        Scanner input = new Scanner(System.in);
        
        //This section allows for user input
        System.out.println("Hey there, you have now entered the Aquatic "
                + "Animal zone! Lets get started . . .\n");
        
        System.out.print("Please enter the name of your aquatic animal: ");
        String name = input.nextLine();
        
        System.out.print("Please enter the color(s) of your aquatic animal: ");
        String color = input.nextLine();
        
        System.out.println("Does your aquatic animal swim (Yes or No)? ");
        System.out.print("(Example of No: Some crabs only walk on the sea floor): ");
        String swim = input.nextLine();
        
        //Creates fish object
        AquaticAnimals fish = new AquaticAnimals(name, color, swim);
         
        //displays a message from the AquaticAnimal class
        fish.displayMes();
        
        System.out.println("One more step and we are done!");
        
        System.out.print("Please enter YOUR name: ");
        String user = input.nextLine();
        
        //Displays the board of information
        //that the user inputted
        System.out.println(" ");
        fish.displayInfo(user);
        
        //AquaticFish inherted a sweet message from the Superclass Animal
        System.out.println(" ");
        fish.scMess();
        
    }
    
}
