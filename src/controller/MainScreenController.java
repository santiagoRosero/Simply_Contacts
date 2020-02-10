package controller;

/**
 * Controller Class for the Main Screen window.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.Agenda;
import model.Course;
import model.Student;

import java.io.IOException;

public class MainScreenController {

    private Stage stage;
    private Agenda agenda;
    private Student currentStudent;
    private Course selectedCourse;

    {
        try {
            agenda = new Agenda();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void initialize() {
        studentPhoto.setImage(new Image("https://www.sackettwaconia.com/wp-content/uploads/default-profile.png"));
        currentStudent = null;
        selectedCourse = null;
    }

    @FXML // fx:id="studentPhoto"
    private ImageView studentPhoto; // Value injected by FXMLLoader

    @FXML // fx:id="studentLabel"
    private Label studentLabel; // Value injected by FXMLLoader

    @FXML // fx:id="informationTA"
    private TextArea informationTA; // Value injected by FXMLLoader

    @FXML // fx:id="coursesTV"
    private TableView<?> coursesTV; // Value injected by FXMLLoader

    @FXML // fx:id="coursesTVColumn"
    private TableColumn<?, ?> coursesTVColumn; // Value injected by FXMLLoader

    @FXML // fx:id="creditsTVColumn"
    private TableColumn<?, ?> creditsTVColumn; // Value injected by FXMLLoader

    @FXML // fx:id="courseInfoTA"
    private TextArea courseInfoTA; // Value injected by FXMLLoader

    @FXML
    void addCourse() throws IOException {
        loadStage("../view/EditCourse.fxml", "New Course");
    }

    @FXML
    void addStudent() throws IOException {
        loadStage("../view/EditContact.fxml", "New Contact");
    }

    @FXML
    void deleteCurrentCourse() {
        currentStudent.getCourses().remove(selectedCourse);
        //TODO
    }

    @FXML
    void deleteCurrentStudent() {
        int indexOfStudent = agenda.getContacts().indexOf(currentStudent);
        agenda.deleteContact(indexOfStudent);
        //TODO
    }

    @FXML
    void editCourse() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/EditCourse.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Edit Course");
        EditCourseController editCourseCtrl = fxmlLoader.getController();
        editCourseCtrl.courseNameLabel.setText(coursesTV.getSelectionModel().getSelectedItem().toString());//TODO: check if works
        editCourseCtrl.setStage(stage);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void editStudent() throws IOException {
        loadStage("../view/EditContact.fxml", "Edit Contact");
    }

    @FXML
    void getNextStudent() {

    }

    @FXML
    void getPrevStudent(ActionEvent event) {

    }

    @FXML
    void loadReport() throws IOException {
        loadStage("../view/Report.fxml", "Report");
    }

    @FXML
    void openCourseSearchWindow(ActionEvent event) {

    }

    @FXML
    void openStudentSearchWindow(ActionEvent event) {

    }

    private void loadStage(String path, String title) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(path));
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

}
