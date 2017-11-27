/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Acquaintance.IBusiness;
import GUI.GUIController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Rol's StudiePC
 */
public class UI extends Application {
    
    private static IBusiness business;
    
    @Override
    public void start(Stage primaryStage) throws  Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GUIController"));
        Parent root = loader.load();
        
        GUIController controller = loader.getController();
        controller.injectBusiness(business);
        
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
