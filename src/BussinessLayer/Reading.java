/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLayer;
import Aqcuaintance.IReading; 

/**
 *
 * @author sdown
 */
public class Reading implements IReading{
    double value;
    double timeStamp;
    String id;

    public Reading(double value) {
        this.timeStamp = System.currentTimeMillis();
        this.value = value;
       
    }
    
    public String toString(){
        return "Timestamp: " + timeStamp + "\n Value: " + value;
    }
}
