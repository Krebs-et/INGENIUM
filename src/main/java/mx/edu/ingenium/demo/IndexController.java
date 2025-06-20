package mx.edu.ingenium.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class IndexController {

    @FXML
    private ListView<String> calendarCategories;

    @FXML
    private Label myLabel;

    private final String[] events = {"Hogar", "Social", "Trabajo", "Escuela"};

    @FXML
    public void initialize() {
        calendarCategories.getItems().addAll(events);

//        calendarCategories.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
//            myLabel.setText("Seleccionaste: " + newVal);
//        });
    }
}