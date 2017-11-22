/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Justus
 */
public class OurSystem {
    HashMap<String, Building> buildings = new HashMap<String, Building>();
    public void addBuilding(String name, Building building){
        buildings.put(name, building);
    }
    
    public void removeBuilding(String name){
        buildings.remove(name);
    }
    
    public void printBuildings(){
        for(Map.Entry<String, Building> entry: buildings.entrySet()){
            System.out.println("Name: " + entry.getKey() + entry.getValue());
        }
    }
    
    public void printBuildingSpecificReadings(Building building){
        building.printBuildingReadings();
    }
 
    public static void main(String[] args) {
//        Building building1 = new Building("Building1", "Posthuset");
//        Building building2 = new Building("Building2", "Posthuset123");
//        Building building3 = new Building("Building3", "Posthuset321");
//        
//        OurSystem system = new OurSystem();
//        
//        
//        system.addBuilding("Building1", building1);
//        system.addBuilding("Building2", building2);
//        system.addBuilding("Building3", building3);
//        
//        system.printBuildings();
//        System.out.println("*******************************");
//        
//        System.out.println(" removing.....");
//        System.out.println("*******************************");
//        system.removeBuilding("Building1");
//        system.printBuildings();
//        
//        System.out.println("*******************************");
//        System.out.println("Sensor readings");
//        
//        System.out.println("*******************************");
//        Sensor sensor1 = new Sensor("TempSensor1");
//        building3.addSensor(sensor1);
//        sensor1.setReading(50);
//        sensor1.setReading(100);
//        sensor1.setReading(200);
//        
//        system.printBuildingSpecificReadings(building3);
        
    }
}
