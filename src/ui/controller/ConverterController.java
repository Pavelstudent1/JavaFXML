package ui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import ui.MainClass;

public class ConverterController {
	
	@FXML private TextField pathInput;
	@FXML private ProgressBar progress;
	@FXML private Button openButton;
	@FXML private Button convertButton;
	
	private MainClass mainClass;
	
	
	public ConverterController() {}
	
	public void setMain(MainClass maincl){ this.mainClass = maincl; }
	
	@FXML
	private void initialize() {
		System.out.println(pathInput);
		System.out.println(progress);
		System.out.println(openButton);
		System.out.println(convertButton);
	}

}
