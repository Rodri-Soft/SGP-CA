package controller;

import domain.Prototype;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class FXMLConsultPrototypeController implements Initializable {


    @FXML private AnchorPane scenePane;

    @FXML private TextArea textAreaDescription;

    private Prototype prototype = FXMLPrototypeListController.prototypeSelected;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        textAreaDescription.setText(prototype.toString());

    }

    @FXML
    private void clickExit(){

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText("¿Estás seguro de que deseas salir?");
        alert.setTitle("Salir");
        Optional<ButtonType> action = alert.showAndWait();

        if (action.get() == ButtonType.OK) {
            Stage stage = (Stage) scenePane.getScene().getWindow();
            stage.close();
        }

    }
}
