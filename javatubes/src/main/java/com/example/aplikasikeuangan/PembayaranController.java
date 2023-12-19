package com.example.aplikasikeuangan;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class PembayaranController extends MasukController implements masukmenu {
    private int kode = 1234;
    @FXML
    private TextField norekbayar;

    @FXML
    private TextField KODE;

    @FXML
    private TextField nominal1;

    @FXML
    private PasswordField passbayar;

    @FXML
    public void bayar() {
        if (norekbayar.getText().equals(String.valueOf(Norek)) && passbayar.getText().equals(String.valueOf(Passtransaksi))) {
            if (KODE.getText().equals(String.valueOf(kode))) {
                Global.nbayar = Integer.parseInt(nominal1.getText());
                validateok();
            }

        }
    }

    @FXML
    public void cancelbayar() {
        validateok();

    }

    @Override
    public void validateok() {
        try {
            FXMLLoader fxmlLoaderbayar= new FXMLLoader(HelloController.class.getResource("masuk.fxml"));
            Scene scenebayar = new Scene(fxmlLoaderbayar.load(), 490.0, 301.0);
            Stage stagebayar = new Stage();
            stagebayar.setTitle("Aplikasi Keuangan");
            stagebayar.setScene(scenebayar);
            stagebayar.show();


        } catch (Exception e) {

        }
    }

public class Global{
    public static int nbayar = 0;
}}