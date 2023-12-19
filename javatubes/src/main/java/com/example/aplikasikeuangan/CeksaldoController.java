package com.example.aplikasikeuangan;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CeksaldoController extends MasukController implements masukmenu {

    @FXML
    private Label hasil;

    @FXML
    private Label jumlah;

    @FXML
    public void saldo(){
        hasil.setText(String.valueOf(Norek));
        int jum = 10000;
        jumlah.setText(String.valueOf(jum + TabungController.Global.ntabung - PenarikanController.Global.ntarik - PembayaranController.Global.nbayar));

     }

    public void validateok() {
        try {
            FXMLLoader fxmlLoadersaldo = new FXMLLoader(HelloController.class.getResource("masuk.fxml"));
            Scene scenesaldo = new Scene(fxmlLoadersaldo.load(), 490.0, 301.0);
            Stage stagesaldo = new Stage();
            stagesaldo.setTitle("Aplikasi Keuangan");
            stagesaldo.setScene(scenesaldo);
            stagesaldo.show();



        }catch (Exception e){

        }

    }
}

