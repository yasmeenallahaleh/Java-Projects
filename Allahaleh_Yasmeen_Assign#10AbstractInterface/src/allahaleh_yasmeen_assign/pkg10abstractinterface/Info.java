/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allahaleh_yasmeen_assign.pkg10abstractinterface;

/**
 *
 * @author YasmeenAllahaleh
 */
public abstract class Info {
    
    //varibles that describe penguin
    int size; 
    String name;
    String color;
    String type;
    String food;

    //This mthod allows the penguin to says goodbye
    //based on the name given in the begining of the main drive
    public void goodBye(String user){
        System.out.printf("Honk Squak %s!%n", user);
        System.out.printf("(That means GoodBye %s in Penguin Language)%n", user);
    }
    
    
}
