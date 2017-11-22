/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acquaintance;
import java.util.ArrayList;
/**
 *
 * @author Justus
 */
public interface IBuilding {
    public String getName();
    public String getAdress();
    public void addSensor(ISensor sensor);
    public ArrayList<ISensor> getSensors();
    public void printBuildingReadings();
}
