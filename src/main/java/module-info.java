module mx.edu.ingenium.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens mx.edu.ingenium.demo to javafx.fxml;
    exports mx.edu.ingenium.demo;
}