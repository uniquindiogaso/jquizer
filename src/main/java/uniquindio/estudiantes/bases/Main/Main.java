package uniquindio.estudiantes.bases.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	private Parent root;
	private Stage stage;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		stage = primaryStage;
		root = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		
		launch(args);

	}



}
