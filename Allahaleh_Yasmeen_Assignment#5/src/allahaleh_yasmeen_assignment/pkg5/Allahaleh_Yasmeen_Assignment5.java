/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allahaleh_yasmeen_assignment.pkg5;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Yasmeen Allahaleh
 * 
 */
//PROGRAM DOC FILE ASSIGN #5
//Programmer Name: Yasmeen Allahaleh
//Assignment Start: 8:15 p.m.
//Assignment Completion: 10:04 p.m.
//Total Hours for Assignment: 1 hour and 49 minutes
//Comments: This project was really fun to do because of the coding of the calculation of 
//standard deviation, population and sample. It wasn't too difficult, but it really was time 
//consuming. What got me the most was the alignment portion whenever a negative was pushing 
//it one character off and took me a while to figure it out. I also enjoyed the arrays a lot
//as that was one of my favorite topics when learning C++. Overall, it was a great assignment 
//to work on.

public class Allahaleh_Yasmeen_Assignment5 {

    /**
     * @param args the command line arguments
     */
    //this method uses varable length arguement to compute the population
    //standard devation of values stored in an array
    //returns standard deviation of population
    public static double standDevOne(double... numbers){
        
        double total = 0;
        
        for(double val : numbers)
        {
            total += val;
        }
        
        double mean = total/numbers.length;
        double distance = 0;
        double disTotal = 0;
        
        for(int i = 0; i < numbers.length; i++)
        {
            distance = numbers[i] - mean;
            distance = distance * distance;
            disTotal += distance;

        }
        
        double n = disTotal / numbers.length;
        
        double standDev = Math.sqrt(n);
      
        return standDev;
        
    }
    
    //this method uses varable length arguement to compute the sample
    //standard devation of values stored in an array
    //returns standard deviation of sample
    public static double standDevTwo(double... numbers){
        
        double total = 0;
        
        for(double val : numbers)
        {
            total += val;
        }
        
        double mean = total/numbers.length;
        double distance = 0;
        double disTotal = 0;
        
        for(int i = 0; i < numbers.length; i++)
        {
            distance = numbers[i] - mean;
            distance = distance * distance;
            disTotal += distance;

        }
        
        double n = disTotal / (numbers.length - 1);

        double stDevSamp = Math.sqrt(n);
        
        return stDevSamp;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creates Scanner
        Scanner input = new Scanner(System.in);
        
        //Asks user how to create an array
        System.out.print("How many values would you like to store in the array? ");
        int value = input.nextInt();
        
        //Creates an array
        double[] storage = new double[value];
        
        //Allows the user to input values in arrays
        for(int i = 0; i < storage.length; i++)
        {
            System.out.printf("Enter a value #%d: ", i+1);
            storage[i] = input.nextDouble();
        }
        
        //Vrables to store max and min
        double min = storage[0];
        double max = storage[0];
        
        //Sift through the array to determine the max and minimum
        //value in the array
        for(int i = 0; i < storage.length; i++)
        {
             if(storage[i] < min)
             {
                 min = storage[i];
             }
             if(storage[i] > max)
             {
                 max = storage[i];
             }
        }
        
        //Lines 123-130 are used to calulate the average of the numbers 
        //in the array
        double total = 0;
        
        for(int i = 0; i < storage.length; i++)
        {
          total = total + storage[i];  
        }
        
        double average = total / value;
        
        //This outputs and displays the output and information
        System.out.println("The statistics for your user entered array is: ");
        System.out.println("----------------------------------------------- \n");
        System.out.print("                         Minimum:    ");
        System.out.printf("%6.3f%n", min);
        System.out.print("                         Maximum:    ");
        System.out.printf("%6.3f%n", max);
        System.out.print("                         Average:    ");
        System.out.printf("%6.3f%n", average);
        System.out.print("  Standard Deviation(population):    ");
        System.out.printf("%6.3f %n", standDevOne(storage));
        System.out.print("     Standard deviation (sample):    ");
        System.out.printf("%6.3f %n", standDevTwo(storage));
           
        
    }
    
}
