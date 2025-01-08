/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allahaleh_yasmeen_trafficsignal;

/**
 *
 * @author YasmeenAllahaleh
 */
/*
PROGRAMMER DOCUMENTATION FILE:
Programmer Name: Yasmeen Allahaleh
Assignment Start:01/28/2024: 11:30 a.m. 
Assignment Completion: 1/028/2024: 12:35 p.m.
Total Hours for Assignment: 
Comments: I highly enjoyed this assignment as I liked
dealing with the enum type of the traffic signals. It took me a while to figure out why 
my variables wasn't displaying in the console as I accidentally put 
TrafficSignal, TrafficSignal.getDuration()) instead of
the word signal on line #34
*/


public class Allahaleh_Yasmeen_TrafficSignal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Signal Type:      Duration (Seconds):\n");
        
        //Loops through and displays the enum types
        //and their durations in seconds
        for(TrafficSignals signal : TrafficSignals.values()){
            System.out.printf("%-20s%-20d%n", signal, signal.getDuration());
            
        }
        
        
    }
    
}
