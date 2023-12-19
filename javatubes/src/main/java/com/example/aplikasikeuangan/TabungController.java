package com.example.aplikasikeuangan;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class TabungController extends MasukController implements masukmenu{
    @FXML
    public TextField norek;

    @FXML
    public TextField nominal;

    @FXML
    public PasswordField passwordtrans;



    @FXML
    public void buttonclicktok() {
        Global.ntabung = Integer.parseInt(nominal.getText());
        if (norek.getText().equals(String.valueOf(Norek))&& passwordtrans.getText().equals(String.valueOf(Passtransaksi))){
            {
                //int ntabung = Integer.parseInt(nominal.getText());
                validateok();
            }


        }
    }
    @FXML
    public void buttonclicktcancel() {
                validateok();

        }


    @Override
    public void validateok() {
        {
            try {
                FXMLLoader fxmlLoadertabung = new FXMLLoader(HelloController.class.getResource("masuk.fxml"));
                Scene scenetabung = new Scene(fxmlLoadertabung.load(), 490.0, 301.0);
                Stage stagetabung = new Stage();
                stagetabung.setTitle("Aplikasi Keuangan");
                stagetabung.setScene(scenetabung);
                stagetabung.show();


            } catch (Exception e) {

            }}

    }

public class Global{
    public static int ntabung = 0;
}}


