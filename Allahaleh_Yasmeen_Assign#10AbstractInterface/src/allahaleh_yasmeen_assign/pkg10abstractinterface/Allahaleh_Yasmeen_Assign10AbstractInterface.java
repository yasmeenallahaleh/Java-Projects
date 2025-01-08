/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allahaleh_yasmeen_assign.pkg10abstractinterface;

import java.util.Scanner;

/**
 *
 * @author YasmeenAllahaleh
 */
/*
Programmer Name: Yasmeen Allahaleh
Assignment Start: 02/02/2024 4:36 p.m.
Assignment Completion: 02/02/2024 6:17 p.m.
Total Hours for Assignment: 1 hour 53 Minutes
Comments: I really enjoyed making this assignment. I really love penguins
,so I decide to make a tiny walkthrough of a penguin exhibit while allowing
the user to interact with the penguin named "Flipper". 
*/
public class Allahaleh_Yasmeen_Assign10AbstractInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        //Creates Scanner object
        Scanner input = new Scanner(System.in);
        
        //Displays instructions for user as they
        //go through the enguin exhibit
        System.out.println("Welcome to the Aquarium ! ! !");
      
        System.out.print("You've entered the Penguin Exhbit!\n");

        //Asks for user input for their name
        System.out.print("Let's look at some information about this Penguin!\n");
        System.out.print("First enter your name: ");
        String user = input.nextLine();

        System.out.print("Great! Lets go . . .");
        System.out.print(" This is the penguin exhbit! Here's some information\n\n");
        
        //Creates penguin object
        Aquarium penguin = new Aquarium("Flipper", "Black, White, Yellow", 4, 
                "Emperor Penguin", "Squid");

        //displays the information of the penguin
        penguin.display();
       
        //asks the user what action they woud like to 
        //do to penguin
        System.out.print("Isn't this penguin pretty cool!\n");
        System.out.print("You can also tell the penguin to Wave or Dive into the water!\n");
        System.out.print("Please enter '1' to Wave to the Penguin or '2' to make him Dive: \n");
        int choice = input.nextInt();
        
        //decides the action based on user input
        if(choice == 1)
        {
            penguin.wave();
            penguin.goodBye(user);
        }
        else if(choice == 2)
        {
            penguin.swim();
            penguin.goodBye(user);
        }
        else
        {
            System.out.print("You've entered an invalid input . . . Sorry\n");
        }
        
    }
    
}