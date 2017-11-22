/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BussinessLayer.Building;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Pottemuld
 */
public class GUIController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    private ObservableList<Building> buildings;
    private Object listView;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.buildings =FXCollections.observableArrayList();
        listView.setItems(buildings);
        
    }
    
    //Add Building method
    private void addButtonAction(ActionEvent event) {
        if (!nameField.getText().equals("") && !adressField.getText().equals("")){
            Building newBuilding = new Building(nameField.getText(), adressField.getText());
            Building.add(newBuilding);
            nameField.clear();
            adressField.clear();
        }
        
    }
    
}
