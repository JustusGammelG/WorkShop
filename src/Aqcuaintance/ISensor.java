/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aqcuaintance;
import java.util.ArrayList;
/**
 *
 * @author Justus
 */
public interface ISensor {

    public IReading getLatestReading();
    public ArrayList<IReading> getHistory();
    public void setReading(double value);
    


}