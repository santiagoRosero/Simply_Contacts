package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class ReportController {

    private Stage stage;

    @FXML // fx:id="avgCourses_Student_Label"
    private Label avgCourses_Student_Label; // Value injected by FXMLLoader

    @FXML // fx:id="avgCredits_Student_Label"
    private Label avgCredits_Student_Label; // Value injected by FXMLLoader

    @FXML // fx:id="mostCourseLabel"
    private Label mostCourseLabel; // Value injected by FXMLLoader

    @FXML // fx:id="leastCourseLabel"
    private Label leastCourseLabel; // Value injected by FXMLLoader

    @FXML // fx:id="coursesTV"
    private TableView<?> coursesTV; // Value injected by FXMLLoader

    @FXML // fx:id="coursesTVColumn"
    private TableColumn<?, ?> coursesTVColumn; // Value injected by FXMLLoader

    @FXML // fx:id="courseInfoTA"
    private TextArea courseInfoTA; // Value injected by FXMLLoader

    @FXML
    void returnToMainMenu() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/MainScreen.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Simply Contacts");
        EditCourseController editCourseCtrl = fxmlLoader.getController();
        editCourseCtrl.setStage(stage);
        stage.setScene(scene);
        stage.show();
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
