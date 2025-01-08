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
//SUPERCLASS
public class Animals {
    
    //constructor
    public Animals(){
        super();
    }  
  
  //protected varaibles that are declared in the superclass
  protected String message = "This is a message from the Animal Super Class!";  
  protected String name;
  protected String color;
  
  //This method display a message
  public void scMess()
  {
      System.out.printf(message);
      System.out.print("\nI think your Aquatic Animal is super cool!");
  }
    
}
