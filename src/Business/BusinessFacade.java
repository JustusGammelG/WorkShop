/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Acquaintance.IBuilding;
import Acquaintance.IReading;
import Acquaintance.ISensor;
import Acquaintance.IBusiness;

/**
 *
 * @author Alexa
 */

public class BusinessFacade implements IBusiness {
    
    static IBusiness business;
    
    public static void injectBusiness(IBusiness _business) {
        business = _business;
    }

    @Override
    public void addBuilding(String name, String adress) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeBuilding(String name, String adress) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addSensor(Building building, String id, String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeSensor(Building building, String id, String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getReading(Sensor sensor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public void setReading(double value){
        
    }
    
    
    
}
