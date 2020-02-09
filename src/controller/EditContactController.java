package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * Controller Class for the Edit Contact window.
 */
public class EditContactController {

    @FXML // fx:id="contactNameLabel"
    private Label contactNameLabel; // Value injected by FXMLLoader

    @FXML // fx:id="displayPhoto"
    private ImageView displayPhoto; // Value injected by FXMLLoader

    @FXML // fx:id="nameTF"
    private TextField nameTF; // Value injected by FXMLLoader

    @FXML // fx:id="phoneTF"
    private TextField phoneTF; // Value injected by FXMLLoader

    @FXML // fx:id="careerCB"
    private ComboBox<?> careerCB; // Value injected by FXMLLoader

    @FXML // fx:id="emailTF"
    private TextField emailTF; // Value injected by FXMLLoader

    @FXML // fx:id="dobTF"
    private TextField dobTF; // Value injected by FXMLLoader

    @FXML // fx:id="addressTF"
    private TextField addressTF; // Value injected by FXMLLoader

    @FXML // fx:id="idTF"
    private TextField idTF; // Value injected by FXMLLoader

    @FXML // fx:id="photoURL_TF"
    private TextField photoURL_TF; // Value injected by FXMLLoader

    @FXML // fx:id="nrcTF"
    private TextField nrcTF; // Value injected by FXMLLoader

    @FXML
    void returnToMainScreen(ActionEvent event) {

    }

    @FXML
    void saveStudent(ActionEvent event) {

    }

}

