package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * Controller Class for the Search Contact window.
 */
public class SearchContactController {

    @FXML // fx:id="infoTF"
    private TextField infoTF; // Value injected by FXMLLoader

    @FXML // fx:id="criteriaCB"
    private ComboBox<?> criteriaCB; // Value injected by FXMLLoader

    @FXML
    void returnToMainScreen(ActionEvent event) {

    }

    @FXML
    void searchContact(ActionEvent event) {

    }

}
