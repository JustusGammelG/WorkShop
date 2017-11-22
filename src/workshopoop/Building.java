/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshopoop;

/**
 *
 * @author Justus
 */
public class Building implements IBuilding {
    
    private String name;
    private String adress;
    private int numbOfSensors;
    

    public Building(String name, String adress, int numbOfSensors) {
        this.name = name;
        this.adress = adress;
        this.numbOfSensors = numbOfSensors;
    }
    
    
    
    //Arraylist<Sensor>
    
    //Building(adress, name, sensor)

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getNumbOfSensors() {
        return numbOfSensors;
    }

    @Override
    public String getNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfSensors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
