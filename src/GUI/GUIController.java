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
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

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
    private TextField nameField;
    private TextField adressField;
    @FXML
    private Tab readingTab;

    /**
     * Initializes the controller class.
     */
    
    private ObservableList<Building> buildings;
    private Object listView;
    @FXML
    private TextField buildingNameField;
    @FXML
    private TextField buildingAddressField;
    @FXML
    private Button removeBuildingButton;
    @FXML
    private Button addBuildingButton;
    @FXML
    private ListView<?> sensorListView;
    @FXML
    private Button addSensorButton;
    @FXML
    private Button sensorRemoveButton;
    @FXML
    private TextField sensorIDField;
    @FXML
    private RadioButton CO2RadioButton;
    @FXML
    private ToggleGroup sensorTypeToggleGroup;
    @FXML
    private RadioButton temperatureRadioButton;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.buildings =FXCollections.observableArrayList();
        buildingListView.setItems(buildings);
        
    }
    
    //Add Building method
    private void addButton(ActionEvent event) {
        if (!nameField.getText().equals("") && !adressField.getText().equals("")){
            Building newBuilding = new Building(nameField.getText(), adressField.getText());
            buildings.add(newBuilding);
            nameField.clear();
            adressField.clear();
        }
        
    }

    
}
