/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLayer;
import java.util.ArrayList;
import Aqcuaintance.ISensor;
import Aqcuaintance.IBuilding;
import Aqcuaintance.IReading;

/**
 *
 * @author Justus
 */
public class Building implements IBuilding {
    
    private String name;
    private String adress;
    ArrayList<ISensor> sensors = new ArrayList<ISensor>();
    

    public Building(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAdress() {
        return adress;
    }

    @Override
    public void addSensor(ISensor sensor) {
       sensors.add(sensor);
    }

    @Override
    public ArrayList<ISensor> getSensors() {
        return sensors;
    }
    
    @Override
    public void printBuildingReadings() {
        for(ISensor sensor: sensors){
            for(IReading reading: sensor.getHistory()){
                System.out.println(reading);
            }
            
            
        }
    }
    
    @Override
    public String toString(){
        return "Name: " + getName() + "\n" + "Adress: " + getAdress();
                 
    }
    
}
