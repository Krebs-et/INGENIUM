package mx.edu.ingenium.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LogInController {

@FXML
public Button IniciarSesion;

    @FXML
    private void cerrarSesion(ActionEvent event) {
        //Codigo de Funcion segun LUIS
        try {
            //1. necesitamos cargar mi nueva ventana
            Parent login = FXMLLoader.load(getClass().getResource("index.fxml")
            );

            //2 Obtener el stage que ya existia previamente
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            //3. Definir oh preparar la nueva ecena
            Scene escena = new Scene(login);
            //4 =. Poner la nueva ecena
            stage.setScene(escena);
            //5. asegurarno de que de vea
            stage.show();


        }catch(Exception e){
            System.out.println("Ocurrio un erro");

        }
    }


}
