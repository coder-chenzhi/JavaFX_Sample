package application.popup;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController implements Initializable {

/*
@FXML
private Label label;
*/
	
@FXML
private void handleButtonAction(ActionEvent event) throws Exception {
    System.out.println("You clicked me!");
    //Here I want to swap the screen!

    Stage stageTheEventSourceNodeBelongs = (Stage) ((Node)event.getSource()).getScene().getWindow();
    // OR
    // System.out.println(stageTheEventSourceNodeBelongs);
    // Stage stageTheLabelBelongs = (Stage) label.getScene().getWindow();
    // System.out.println(stageTheLabelBelongs);
    // these two of them return the same stage
    // Swap screen
    Stage popup = new Stage();
    Parent root = FXMLLoader.load(getClass().getResource("Select.fxml"));
    popup.initModality(Modality.WINDOW_MODAL);
    popup.setScene(new Scene(root));
    popup.initOwner(stageTheEventSourceNodeBelongs);
    popup.show();
    // popup.hide();
}

@Override
public void initialize(URL url, ResourceBundle rb) {
    // TODO
}    
}
