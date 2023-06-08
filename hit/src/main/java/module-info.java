module com.example.hit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hit to javafx.fxml;
    exports com.example.hit;
}