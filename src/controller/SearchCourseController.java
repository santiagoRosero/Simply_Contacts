package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

/**
 * Controller Class for the Search Course window.
 */
public class SearchCourseController {

    @FXML // fx:id="infoTF"
    private TextField infoTF; // Value injected by FXMLLoader

    @FXML // fx:id="criteriaCB"
    private ChoiceBox<?> criteriaCB; // Value injected by FXMLLoader

    @FXML
    void returnToMainScreen(ActionEvent event) {

    }

    @FXML
    void searchCourse(ActionEvent event) {

    }

}
