/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acquaintance;
import Business.BusinessFacade;
import java.util.ArrayList;

/**
 *
 * @author Justus
 */
public interface IBusiness {
    
    public void addBuilding(Building Building);
    
    public void removeBuilding(Building Building);
    
    public void addSensor(Building building, String id, String type);
    
    public void removeSensor(Building building, String id, String type);
    
    public void getReading(Sensor sensor);
    
    public void setReading(double value);
    
    ArrayList<Building> buildingList = new ArrayList<Building>();
    
    ArrayList<Sensor> sensorList = new ArrayList<>();
    
}
