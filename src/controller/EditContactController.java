package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.Course;
import model.Student;

/**
 * Controller Class for the Edit Contact window.
 */
public class EditContactController {

    private Stage stage;
    private Student student;

    @FXML // fx:id="contactNameLabel"
    private Label contactNameLabel; // Value injected by FXMLLoader

    @FXML // fx:id="displayPhoto"
    private ImageView displayPhoto; // Value injected by FXMLLoader

    @FXML // fx:id="nameTF"
    private TextField nameTF; // Value injected by FXMLLoader

    @FXML // fx:id="phoneTF"
    private TextField phoneTF; // Value injected by FXMLLoader

    @FXML // fx:id="careerCB"
    private TextField careerTF; // Value injected by FXMLLoader

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
    void initialize() {


    }

    @FXML
    void returnToMainScreen(ActionEvent event) {

    }

    @FXML
    void saveStudent(ActionEvent event) {

    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setup(){
        if (student == null) {
            displayPhoto.setImage(new Image("https://www.sackettwaconia.com/wp-content/uploads/default-profile.png"));
        } else {
            displayPhoto.setImage(new Image(student.getPictureURL()));
            contactNameLabel.setText(student.getName());
            nameTF.setText(student.getName());
            phoneTF.setText(student.phoneNumber());
            emailTF.setText(student.getEmail());
            dobTF.setText(student.getBirthdate());
            addressTF.setText(student.getAddress());
            idTF.setText(student.getCode());
            careerTF.setText(student.getCareer());
            photoURL_TF.setText(student.getPictureURL());
            String toAdd = "";
            for (Course course : student.getCourses()
            ) {
                toAdd += course.getNRC() + ",";
            }
            toAdd = toAdd.substring(0, toAdd.length() - 1);
            nrcTF.setText(toAdd);
        }

    }
}

