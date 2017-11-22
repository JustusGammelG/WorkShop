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
public class Building {
    
    private String name;
    private String adress;
    private int numbOfSensors;
    private double AirQuality;
    private double temperature;

    public Building(String name, String adress, int numbOfSensors, double AirQuality, double temperature) {
        this.name = name;
        this.adress = adress;
        this.numbOfSensors = numbOfSensors;
        this.AirQuality = AirQuality;
        this.temperature = temperature;
    }
    
    
    
    //Arraylist<Sensor>
    
    //adress
    
    //getAdress;
    
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

    public double getAirQuality() {
        return AirQuality;
    }

    public void setAirQuality(double AirQuality) {
        this.AirQuality = AirQuality;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    
    
}
