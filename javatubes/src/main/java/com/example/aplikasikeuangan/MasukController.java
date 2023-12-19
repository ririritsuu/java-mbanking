package com.example.aplikasikeuangan;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public  class MasukController extends HelloController {
    public String nama = " Kelompok 13 ";
    public int Norek = 110121349;

    public int Passtransaksi = 1010;
    private String alamat = " Telkom University ";
    private long nohp = 628106463;
    @FXML
    private Label profil;

    @FXML
    private Label bantuan;



    @FXML
    protected void profill() {
        boolean isVisible = profil.isVisible();
        profil.setVisible(!isVisible);
        profil.setText("Nama: " + nama + "\nAlamat: "+ alamat + "\nNo Hp: +"+ nohp);
    }
    @FXML
    protected  void bantuann() {
        boolean isVisible = bantuan.isVisible();
        bantuan.setVisible(!isVisible);
        bantuan.setText("More information can access\nAplikasiKeuangan.co.id");
    }
    @FXML
    protected  void logout(){
        System.exit(0);
    }


    @FXML
    protected void onHelloButtonClick() {validateokt();}
    @FXML
    protected void onHelloButtonClick1() {
        validatepn();
    }
    @FXML
    protected void onHelloButtonClick2() {
        validatepr();
    }
    @FXML
    protected void onHelloButtonClick3() {
        validatecs();
    }
    @FXML
    public void validateokt() {
        try {
            FXMLLoader fxmlLoadermasuk = new FXMLLoader(HelloController.class.getResource("tabung.fxml"));
            Scene scenehello = new Scene(fxmlLoadermasuk.load(), 490.0, 301.0);
            Stage stagehello = new Stage();
            stagehello.setTitle("Aplikasi Keuangan");
            stagehello.setScene(scenehello);
            stagehello.show();


        } catch (Exception e) {
        }
    }
    @FXML
    public void validatepn() {
        try {
            FXMLLoader fxmlLoadermasuk = new FXMLLoader(HelloController.class.getResource("penarikan.fxml"));
            Scene scenehello = new Scene(fxmlLoadermasuk.load(), 490.0, 301.0);
            Stage stagehello = new Stage();
            stagehello.setTitle("Aplikasi Keuangan");
            stagehello.setScene(scenehello);
            stagehello.show();


        } catch (Exception e) {
        }
    }
    @FXML
    public void validatepr() {
        try {
            FXMLLoader fxmlLoadermasuk = new FXMLLoader(HelloController.class.getResource("pembayaran.fxml"));
            Scene scenehello = new Scene(fxmlLoadermasuk.load(), 490.0, 301.0);
            Stage stagehello = new Stage();
            stagehello.setTitle("Aplikasi Keuangan");
            stagehello.setScene(scenehello);
            stagehello.show();


        } catch (Exception e) {
        }
    }
    @FXML
    public void validatecs() {
        try {
            FXMLLoader fxmlLoadermasuk = new FXMLLoader(HelloController.class.getResource("ceksaldo.fxml"));
            Scene scenehello = new Scene(fxmlLoadermasuk.load(), 490.0, 301.0);
            Stage stagehello = new Stage();
            stagehello.setTitle("Aplikasi Keuangan");
            stagehello.setScene(scenehello);
            stagehello.show();


        } catch (Exception e) {
        }
    }
}
