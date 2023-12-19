package com.example.aplikasikeuangan;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class HelloController {
    public String[] ussername = {"kelompok13"};
    public int[] pass = {1234};

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Label salah;



    @FXML
    public void buttonclick() {
        boolean valid = false;
        for (int i = 0; i < ussername.length; i++) {
            if (username.getText().equals(ussername[i]) && password.getText().equals(String.valueOf(pass[i]))) {
                valid = true;
                break;
            }
        }
        if (valid) {
            validate();
        } else {
            salah.setText("Data yang anda masukan salah");
        }
    }


    @FXML
    public void validate() {
        try {
            FXMLLoader fxmlLoadermasuk = new FXMLLoader(HelloController.class.getResource("masuk.fxml"));
            Scene scenehello = new Scene(fxmlLoadermasuk.load(), 490.0, 301.0);
            Stage stagehello = new Stage();
            stagehello.setTitle("Aplikasi Keuangan");
            stagehello.setScene(scenehello);
            stagehello.show();

        }catch (Exception e){
        }



    }
}



