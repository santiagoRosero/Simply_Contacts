package controller;

import java.io.IOException;
import java.util.Observable;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Controller Class for the Search Contact window.
 */
public class SearchContactController {
	
	public final static String NAME= "name";
	public final static String CODE="code";
	public final static String PHONE="phone";
	public final static String EMAIL = "email";
	public final static String SEARCH ="search";
	public final static String CANCEL="cancel";
	
	private MainScreenController mainCon;

    @FXML // fx:id="infoTF"
    private TextField infoTF; // Value injected by FXMLLoader
    	
    @FXML // fx:id="criteriaCB"
    private ComboBox<?> criteriaCB; // Value injected by FXMLLoader
    
    private Button btnSearch, btnCancel;
    
    public SearchContactController() {
    	ObservableList<String> options = FXCollections.observableArrayList();
    	options.addAll("Name","Code","Phone","Email");
    	criteriaCB = new ComboBox<>(options);
    	infoTF= new TextField();
    	btnSearch = new Button();
    	btnCancel = new Button();
    	btnSearch.setDefaultButton(true);
    	btnCancel.setDefaultButton(true);
    	mainCon=new MainScreenController();
    	
    }
    
    public String getTxtField() {
    	return infoTF.getText();
    }

    @FXML
    void returnToMainScreen(ActionEvent event) {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/MainScreen.fxml"));
       
    	
    }

    @FXML
    void searchContact(ActionEvent event) {
    	if(event.equals(btnSearch)&&criteriaCB.equals(NAME)) {
    		mainCon.searchStudentName(infoTF.getText());
    	}else if(event.equals(btnSearch)&&criteriaCB.equals(CODE)) {
    		mainCon.searchStudentCode(infoTF.getText());
    	}else if(event.equals(btnSearch)&&criteriaCB.equals(PHONE)) {
    		mainCon.searchStudentPhone(infoTF.getText());
    	}else if(event.equals(btnSearch)&&criteriaCB.equals(EMAIL)) {
    		mainCon.searchStudentEmail(infoTF.getText());
    	}else if(event.equals(btnCancel)) {
    		returnToMainScreen(event);
    	}
    }

}
