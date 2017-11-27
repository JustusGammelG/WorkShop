/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;


/**
 *
 * @author Justus
 */
public class Building {
    
    private String name;
    private String adress;
    

    public Building(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }
    
    
    public String getName() {
        return name;
    }

   
    public String getAdress() {
        return adress;
    }
    
    
    
    @Override
    public String toString(){
        return "Name: " + getName() + "\n" + "Adress: " + getAdress();
                 
    }
    
}
