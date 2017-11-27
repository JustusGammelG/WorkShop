/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Acquaintance.IBusiness;
import java.util.ArrayList;

/**
 *
 * @author Alexa
 */

public class BusinessFacade implements IBusiness {
    
    static IBusiness business;
    
    public static void injectBusiness(IBusiness _business) {
        business = _business;
    }

    ArrayList<Building> buildingList = new ArrayList<Building>();
    
    @Override
    public void addBuilding(Building building) {
        buildingList.add(building);
        
    }

    @Override
    public void removeBuilding(Building building) {
        buildingList.remove(building);
    }

    @Override
    public void addSensor(Building building, String id, String type) {
       
    }

    @Override
    public void removeSensor(Building building, String id, String type) {
        
    }

    @Override
    public void getReading(Sensor sensor) {
        
    }

    
    @Override
    public void setReading(double value){
        
    }
    
    
    
}
