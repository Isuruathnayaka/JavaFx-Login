package com.example.demotest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

 public class AppController extends Application {
     public void start(Stage stage) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/demotest/Login.fxml"));

         Scene scene = new Scene(fxmlLoader.load(), 500, 500);
         stage.setTitle("Facebook Login");
         stage.setScene(scene);
         stage.show();
     }

     public static void main(String[] args) {
         launch(args);
     }

}
