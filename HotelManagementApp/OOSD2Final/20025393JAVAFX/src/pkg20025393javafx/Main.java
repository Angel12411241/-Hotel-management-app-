/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20025393javafx;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;

import javafx.scene.Scene;

import javafx.stage.Stage;
import javafx.scene.Parent;
/**
 *
 * @author angel
 */
public class Main extends Application {
    
    
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage stage) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("MainView.fxml"));
            Scene scene = new Scene(root, 664, 435);
            stage.setScene(scene);
            stage.show();
        } catch(IOException e){
            e.printStackTrace();
        }
        
    }

}