/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLayer;
import Acquaintance.IReading; 
import java.util.Date;

/**
 *
 * @author sdown
 */
public class Reading implements IReading{
    double value;
    Date date;
    String id;

    public Reading(double value) {
        this.date = new Date();
        this.value = value;
       
    }
    
    
    public String toString(){
        return "Timestamp: " + date + "\n Value: " + value;
    }
}
