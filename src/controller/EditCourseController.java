package controller;

/**
 * Sample Skeleton for 'EditContact.fxml' Controller Class
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EditCourseController {

    @FXML // fx:id="contactNameLabel"
    private Label contactNameLabel; // Value injected by FXMLLoader

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

}
