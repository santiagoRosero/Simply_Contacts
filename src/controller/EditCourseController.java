package controller;

/**
 * Sample Skeleton for 'EditContact.fxml' Controller Class
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditCourseController {

    private Stage stage;

    @FXML // fx:id="courseNameLabel"
    Label courseNameLabel; // Value injected by FXMLLoader

    @FXML // fx:id="nameTF"
    private TextField nameTF; // Value injected by FXMLLoader

    @FXML // fx:id="creditsTF"
    private TextField creditsTF; // Value injected by FXMLLoader

    @FXML // fx:id="nrcTF"
    private TextField nrcTF; // Value injected by FXMLLoader

    @FXML
    void returnToMainScreen(ActionEvent event) {

    }

    @FXML
    void saveCourse(ActionEvent event) {

    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

}
