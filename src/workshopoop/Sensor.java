/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshopoop;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author sdown
 */
public class Sensor implements ISensor {
    String ID;
    double value;
    ArrayList<Reading> history;

    public Sensor(String ID, double value, ArrayList<Reading> history) {
        this.ID = ID;
        this.value = value;
        this.history = history;
    }

    
   
    
    
    //setReading(Value)
    public void setReading(double value) {
        this.value = value;
    }
    
    //getReading()
   
    
    //getHistory()
    
    
    
    
}
