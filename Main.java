package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override //overriding the application
	public void start(Stage mainStage) {
		// Create a pane for the images
		GridPane pane = new GridPane();

		// Place nodes in the pane
		pane.add(new ImageView(new Image("flag1.gif")), 0, 0);
		pane.add(new ImageView(new Image("flag2.gif")), 1, 0);
		pane.add(new ImageView(new Image("flag5.gif")), 0, 1);
		pane.add(new ImageView(new Image("flag7.gif")), 1, 1);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
    mainStage.setTitle("Exercise_14_01"); // Set the stage title
    mainStage.setScene(scene); // Place the scene in the stage
    mainStage.show(); // Display the stage.
	}
}