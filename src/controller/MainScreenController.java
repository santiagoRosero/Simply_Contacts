package controller;

/**
 * Sample Skeleton for 'MainScreen.fxml' Controller Class
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.image.ImageView;

public class MainScreenController {

    @FXML // fx:id="studentPhoto"
    private ImageView studentPhoto; // Value injected by FXMLLoader

    @FXML // fx:id="studentLabel"
    private Label studentLabel; // Value injected by FXMLLoader

    @FXML // fx:id="informationTA"
    private TextArea informationTA; // Value injected by FXMLLoader

    @FXML // fx:id="coursesTTable"
    private TreeTableView<?> coursesTTable; // Value injected by FXMLLoader

    @FXML // fx:id="coursesTTColumn"
    private TreeTableColumn<?, ?> coursesTTColumn; // Value injected by FXMLLoader

    @FXML // fx:id="creditsTTColumn"
    private TreeTableColumn<?, ?> creditsTTColumn; // Value injected by FXMLLoader

    @FXML // fx:id="courseInfoTA"
    private TextArea courseInfoTA; // Value injected by FXMLLoader

    @FXML
    void editCourse(ActionEvent event) {

    }

    @FXML
    void editStudent(ActionEvent event) {

    }

    @FXML
    void getNextStudent(ActionEvent event) {

    }

    @FXML
    void getPrevStudent(ActionEvent event) {

    }

}
