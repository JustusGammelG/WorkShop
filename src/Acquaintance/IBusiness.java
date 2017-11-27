/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acquaintance;
import Business.Building; 

/**
 *
 * @author Justus
 */
public interface IBusiness {
    
    public void addBuilding(String name, String adress);
    public void removeBuilding(String name, String adress);
    public void addSensor(Building building, String id, String type);
    public void removeSensor(Building building, String id, String type);
    
    
}
