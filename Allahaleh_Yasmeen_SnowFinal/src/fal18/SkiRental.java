package fal18;

// 25 pts total (15 points for correct implementation (3 pts per section below), 10 points code passes all unit test).
// Refer to the UML class diagram for naming of all methods in this class: SkiRentalUML.pdf

// 1. Create public class named SkiRental that inherits SportShopRental.

// 2. Create a private integer member variable named size and initialized to 175.
        
// 3. Implement the abstract method lateCharge which was declared in SportShopRental.
//    The method should only return 10% of the rental cost.

// 4. Implement the toString method that returns a string in the following format:
//    "Rental #{s}, Cost: ${s}, New: {s}, Size: {1} cm"
//    where:  {s} is the format specifier for integers from SportShopRental class toString method (hint: utilize the super keyword),
//            {s} is the format specifier for doubles with width of 7 characters and 2 decimal places of precision from 
//                SportShopRental class toString method (hint: utilize the super keyword),
//            {s} is the format specifier for boolean values from SportShopRental class toString method (hint: utilize the super keyword),
//            {1} is the format specifier for integer with a field width of 4 characters.

// 5. Create all getters and setters for private member variables created in step #2. Note below is specifics for data validation 
//    in specified setter methods below:
//    a. In setter method for setting size, throw a new IllegalArgumentExcetion for
//       any size that is less than 50 or greater than 200, with the exception message: 
//       "Size out of range"

public class SkiRental extends SportShopRental{

   //Private intilized variable 
   private int size = 175;

   //getter method that returns integer size
   public int getSize(){
       return size;
   }
   
    //setter method that throws exception if certain conditions met
    //inserts size variable that is assigned using this keyword
   public void setSize(int size){
      
        if(size < 50 || size > 200)
        {
          throw new IllegalArgumentException("Size out of range");
        }
        else {
          this.size = size;
        }
       
   }
   
   //String method from parent class to display information
   @Override
   public String toString(){
       return String.format("%s, Size: %4d cm", super.toString(), size);
       
   }
   
   //method that returns 10% of rental cost
   @Override
   public double lateCharge(){

       return getRentalCost() * .10;
       
   }
    
    
}