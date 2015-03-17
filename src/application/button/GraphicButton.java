package application.button;

/**
 * Copyright (c) 2008, 2012 Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 */
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
 
/**
 * A button with an embedded image.
 *
 * @see javafx.scene.control.Button
 * @related controls/buttons/CheckBoxes
 * @related controls/buttons/RadioButtons
 * @resource icon-48x48.png
 */
public class GraphicButton extends Application {
    private static final Image ICON_48 = new Image(GraphicButton.class.getResourceAsStream("Capture.PNG"));
    private void init(Stage primaryStage) {
        Group root = new Group();
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 400,100));
        ImageView imageView = new ImageView(ICON_48);
        Button button = new Button("button", imageView);
        button.setContentDisplay(ContentDisplay.LEFT);
        root.getChildren().add(button);
    }
 
    public double getSampleWidth() { return 400; }
 
    public double getSampleHeight() { return 100; }
 
    @Override public void start(Stage primaryStage) throws Exception {
        init(primaryStage);
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }
}
