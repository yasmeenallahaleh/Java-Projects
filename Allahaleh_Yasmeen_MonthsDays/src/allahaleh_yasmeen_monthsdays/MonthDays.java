/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allahaleh_yasmeen_monthsdays;

/**
 *
 * @author YasmeenAllahaleh
 */
public class MonthDays {
    
    //Private Variables 
    private int month;
    private int year;
    
    // Constructor with set methods
    //to check for validation
    public MonthDays(int month, int year) {
      
        setMonth(month);
        setYear(year);
        
        this.month = month;
        this.year = year; 
        
    }
    
    
    //Used to throw IllegalArgumentException
    //if month and year is invalid
    //(demonstarted in the main driver).
    public void validNum(int month, int year)
    {
        if(month < 1 || month > 12 || year < 1){
            throw new IllegalArgumentException(); 
        }
        
        this.month = month;
        this.year = year; 

    }

    //Getter method for months
    public int getMonth(){
        return month;
    }
    //Setter method for months
    //thats throws IllegalArgumentException
    public void setMonth(int month){
        
        
        if(month < 1 || month > 12)
        {
          throw new IllegalArgumentException("Month must be between 1 and 12. Program terminating . . .");
        }
        else {
          this.month = month;
        }
    }
    
    //Getter method for year
    public int getYear(){
        return year;
    }
    
    //Setter method for year
    //thats throws IllegalArgumentException
    public void setYear(int year){
        
        if(year < 1)
        {
          throw new IllegalArgumentException("Years must not be less than 1. Program terminating . . .");
        }
        else{
            this.year = year;
        }
        
    }
    
    //This method calculates the amount of days 
    //based on the years, including leap years
    public int getNumberOfDays(){
        
        int days = 28;
        int calcLeap;
        
        calcLeap = year % 100;
        
        //Checks for leap year
        if(calcLeap == 0){
            calcLeap = year % 400;
            
            if(calcLeap == 0)
            {
                days = 29;
            }
            
        }
        else if(calcLeap != 0){
            calcLeap = year % 4;
            
            if(calcLeap == 0)
            {
                days = 29;
            }
        }
        
        //Calculates days based on month, otherwise, days stay 28 or 29
        //if Feburary
        if(month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12){
            days = 31;
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11)
        {
            days = 30;
        }
        
        return days;
    }
    
    
}
