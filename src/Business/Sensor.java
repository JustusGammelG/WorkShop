/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Acquaintance.IReading;
import Acquaintance.ISensor;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author sdown
 */
public class Sensor implements ISensor {
    String ID;
    IReading value;
    
    ArrayList<IReading> history;

    public Sensor(String ID, Reading value, ArrayList<IReading> history) {
        this.ID = ID;
        this.value = value;
        this.history = history;
    }

    public Sensor(String ID) {
        this.ID = ID;
        this.history = new ArrayList<IReading>();
    }
    

    
    public void setReading(double value) {
        IReading reading = new Reading(value);
        history.add(reading);
        this.value = reading;
    }

    @Override
    public IReading getLatestReading() {
        return value;
    }

    @Override
    public ArrayList<IReading> getHistory() {
        return history;
    }
    
    
    
    
}
