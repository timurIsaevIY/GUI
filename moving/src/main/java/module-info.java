module com.example.moving {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.moving to javafx.fxml;
    exports com.example.moving;
}