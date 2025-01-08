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


public enum TrafficSignals {
    
    //Enum types are signals with the
    //duration in seconds
    GREEN(120),
    RED(100),
    YELLOW(50),
    WALK(20),
    WALK_DONT(80);
    
    //Duration of Enum type in seconds
    private final int duration;
    
    //Enum constructor
    TrafficSignals(int duration){
        this.duration = duration;
    }
    
    //Accessor for duration of signal
    public int getDuration(){
       return duration;
    }
    
}
