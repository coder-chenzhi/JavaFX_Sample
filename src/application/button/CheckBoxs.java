package application.button;

/**
 * Copyright (c) 2008, 2012 Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 */
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
 
/**
 * An example of checkboxes in various states.
 *
 * @see javafx.scene.control.CheckBox
 * @related controls/buttons/GraphicButton
 * @related controls/buttons/RadioButtons
 */
 
public class CheckBoxs extends Application {
     
    private void init(Stage primaryStage) {
        Group root = new Group();
        primaryStage.setScene(new Scene(root));
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        CheckBox cb1 = new CheckBox("Simple checkbox");
 
        CheckBox cb2 = new CheckBox("Three state checkbox");
        cb2.setAllowIndeterminate(true);
        cb2.setIndeterminate(false);
 
        CheckBox cb3 = new CheckBox("Disabled");
        cb3.setSelected(true);
        cb3.setDisable(true);
 
        vbox.getChildren().add(cb1);
        vbox.getChildren().add(cb2);
        vbox.getChildren().add(cb3);
        root.getChildren().add(vbox);
    }
 
    @Override public void start(Stage primaryStage) throws Exception {
        init(primaryStage);
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }
}
