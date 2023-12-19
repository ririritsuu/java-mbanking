module com.example.demo4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aplikasikeuangan to javafx.fxml;
    exports com.example.aplikasikeuangan;
}