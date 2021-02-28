package com.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainClass extends Application {

    @Override
    public void start(Stage colculator) throws Exception {
       try{
        colculator.setTitle("Calculator");
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/calculator/calculator.fxml"));
           colculator.getIcons().add(new Image("/com/icon/calculator.png"));
           Parent root = loader.load();
           Scene scene = new Scene(root);
           colculator.setScene(scene);
           colculator.show();
       } catch(Exception e){
           e.printStackTrace();
       }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
