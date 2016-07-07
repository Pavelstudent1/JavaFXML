package ui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import ui.controller.ConverterController;

public class MainClass extends Application {
	
	private Stage primStage;
	private TabPane root;

	@Override
	public void start(Stage primaryStage) {
		this.primStage = primaryStage;
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainClass.class.getResource("view/RootPane.fxml"));
		try {
			this.root = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("Main Window");
		primaryStage.show();
		
		firstStart();
	}
	
	private void firstStart() {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainClass.class.getResource("view/ConverterPane.fxml"));
		
		try {
			AnchorPane converterPane = (AnchorPane) loader.load();
			root.getTabs().get(0).setContent(converterPane);
			
			ConverterController convertControl = loader.getController();
			convertControl.setMain(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Stage getPrimStage(){ return primStage; }

	public static void main(String[] args) {
		launch(args);
	}
}
