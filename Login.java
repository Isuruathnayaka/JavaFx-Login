package com.example.demotest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Login {
    @FXML
    private TextField txtUserName;
    @FXML
    private TextField txtPassword;



    public void btnLogin(ActionEvent actionEvent) {
        String userName = txtUserName.getText();
        String Password = txtPassword.getText();

        if (userName.equals("admin") && Password.equals("1234")) {
            System.out.println("Login Successfull");
        } else {
            System.out.println("Login Fail.Try Again!");
        }
    }
}