/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Business.Building;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Pottemuld
 */
public class GUIController implements Initializable {

    @FXML
    private Tab buildingTab;
    @FXML
    private ListView<Building> buildingListView;
    @FXML
    private Button addButton;
    @FXML
    private Button removeButton;
    @FXML
    private TextField nameField;
    @FXML
    private TextField adressField;
    @FXML
    private Tab sensorTab;
    @FXML
    private Tab readingTab;

    /**
     * Initializes the controller class.
     */
    
    private ObservableList<Building> buildings;
    private Object listView;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.buildings =FXCollections.observableArrayList();
        buildingListView.setItems(buildings);
        
    }
    
    //Add Building method
    @FXML
    private void addButton(ActionEvent event) {
        if (!nameField.getText().equals("") && !adressField.getText().equals("")){
            Building newBuilding = new Building(nameField.getText(), adressField.getText());
            buildings.add(newBuilding);
            nameField.clear();
            adressField.clear();
        }
        
    }
    
}
