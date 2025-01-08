/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allahaleh_yasmeen_assign.pkg9inheritance;

/**
 *
 * @author YasmeenAllahaleh
 */
//This is a subclass that extends from the animal class
public class AquaticAnimals extends Animals{
    
    //Varable declared in the AquaticAnimal class
    protected String swim;
    
    //Constructor
    //Takes in the the name, color, and swimminh status
    //of the aquatic animal
    public AquaticAnimals(String name, String color, String swim){
        super();
        //These varables are from the superclass
        this.name = name;
        this.color = color;
        
        //this varable is from this subclass
        this.swim = swim;
    }
    
    //Displys message after input
    //is done being inserted
    public void displayMes(){
        System.out.print("Creating Aquatic Board . . . !\n");
    }
    
    //Dislays all the information of the user
    //and takes in the varaible user 
    //to display the user's name from main
    public void displayInfo(String user)
    {
      System.out.printf("%s's Awesome Aquatic Animal Board ! ! ! %n", user);
      System.out.print("--------------------------------------------------\n");
        
      System.out.printf("Aquatic Animal Name: %s%n", name);
      System.out.print(" - - - - - - - - - - - - - - - - - -\n");
      System.out.printf("Color of Aquatic Animal: %s%n", color);
      System.out.print(" - - - - - - - - - - - - - - - - - -\n"); 
      System.out.printf("Swimming Status: %s%n", swim);
        
    }
    
    
}
