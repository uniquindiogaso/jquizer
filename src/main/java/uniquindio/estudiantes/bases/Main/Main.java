package uniquindio.estudiantes.bases.Main;


import javafx.application.Application;
import javafx.stage.Stage;
import uniquindio.estudiantes.bases.ControllerUI.Manejador;




public class Main extends Application {
	

	public static void main(String[] args) {
		
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		new Manejador(primaryStage);
	}

	

	
}
