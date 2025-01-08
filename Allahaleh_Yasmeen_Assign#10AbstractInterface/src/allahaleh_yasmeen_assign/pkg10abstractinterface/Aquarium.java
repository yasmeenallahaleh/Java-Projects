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
public class Aquarium extends Info implements Behavior {
    
    //Constructor
    public Aquarium(String name, String color, int size, String type, String food)
    {
        this.name = name;
        this.color = color;
        this.type = type;
        this.size = size;
        this.food = food;
    }
    
    //This method displays the information of the penguin
    //based on the variles placed in the object parameters
    public void display()
    {
        System.out.printf("Penguin: \n");
        System.out.print("--------------------------\n");
        System.out.printf("Name: %s%n", name);
        System.out.printf("Color: %s%n", color);
        System.out.printf("Type: %s%n", type);
        System.out.printf("Favorite Food: %s%n", food);
        System.out.printf("Size (Feet): %d%n", size);
        
    }
    
    
    //Interface
    @Override
    public void wave(){
        //allows the penguin to scream indecating it waved
        System.out.println("SQUAAAAAKKKKKK! (He Waved)");
    }
    
    //Interface
    @Override
    public void swim(){
        //Makes a splash sound to indicate the penguin dove into the water
        System.out.println("Splish-Splash!");
    }
    
    
}
