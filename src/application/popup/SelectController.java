package application.popup;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class SelectController implements Initializable {
	@FXML
	private ToggleGroup type;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
	private void handleButtonAction(ActionEvent event) throws Exception {
	    System.out.println("You clicked " + ((RadioButton)event.getSource()).getText());
	    //Here I want to swap the screen!
	    ((Node)event.getSource()).getScene().getWindow().hide();
	    
	    /*
	    Stage stageTheEventSourceNodeBelongs = (Stage) ((Node)event.getSource()).getScene().getWindow();
	    Stage popup = new Stage();
	    Parent root = FXMLLoader.load(getClass().getResource("Select.fxml"));
	    popup.initModality(Modality.WINDOW_MODAL);
	    popup.setScene(new Scene(root));
	    popup.initOwner(stageTheEventSourceNodeBelongs);
	    popup.show();
	    */
	}

}
