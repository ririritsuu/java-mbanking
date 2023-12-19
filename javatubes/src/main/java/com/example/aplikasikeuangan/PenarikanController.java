package com.example.aplikasikeuangan;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class PenarikanController extends MasukController implements masukmenu {
    @FXML
    private TextField norek;

    @FXML
    private TextField nominal2;

    @FXML
    private PasswordField passwordtrans;

    @FXML
    public void tarik() {
        if (norek.getText().equals(String.valueOf(Norek))&& passwordtrans.getText().equals(String.valueOf(Passtransaksi)))
            {
                Global.ntarik= Integer.parseInt(nominal2.getText());;
                validateok();

            }


    }
    @FXML
    public void tarikcancel() {

        validateok();
    }
    @Override
    public void validateok(){
        try {
            FXMLLoader fxmlLoadertarik = new FXMLLoader(HelloController.class.getResource("masuk.fxml"));
            Scene scenetarik = new Scene(fxmlLoadertarik.load(), 490.0, 301.0);
            Stage stagetarik = new Stage();
            stagetarik.setTitle("Aplikasi Keuangan");
            stagetarik.setScene(scenetarik);
            stagetarik.show();



        }catch (Exception e){

        }

    }public class Global{
        public static int ntarik = 0;
    }}








