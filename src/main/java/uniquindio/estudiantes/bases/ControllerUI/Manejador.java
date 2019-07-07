package uniquindio.estudiantes.bases.ControllerUI;

import java.io.IOException;
import java.util.List;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import uniquindio.estudiantes.bases.Controllers.UsuarioController;
import uniquindio.estudiantes.bases.Main.Main;
import uniquindio.estudiantes.bases.Model.Usuario;
import uniquindio.estudiantes.bases.Pojos.UsuarioPOJO;

public class Manejador {
	
	private Stage escenario;
	private UsuarioController usercontroller;

	
	public Manejador (Stage escenario)
	{
		this.escenario = escenario;
		usercontroller = new UsuarioController();
		cargarEscenarioLogin();
	}
	
	public void cargarEscenarioLogin()
	{
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("../View/Login.fxml"));
			Stage stage = new Stage();
			Parent root = loader.load();
			
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.show();
			
			LoginControllers login = loader.getController();
			login.setEscenario(stage);
			login.setManejador(this);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
		
	}
	
	public void cargarEscenarioDocente(Usuario usuario)
	{
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("../View/Docente.fxml"));
			Stage stage = new Stage();
			Parent root = loader.load();
			
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.show();
			
			DocenteControllers docente = loader.getController();
			docente.setEscenario(stage);
			docente.setManejador(this);
			docente.setUser(usuario);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
		
	}
	
	public void cargarEscenarioAdmin(Usuario usuario)
	{
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("../View/Administrador.fxml"));
			Stage stage = new Stage();
			Parent root = loader.load();
			
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.show();
			
			AdminControllers administrador = loader.getController();
			administrador.setEscenario(stage);
			administrador.setManejador(this);
			administrador.setUser(usuario);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
		
	}

	public UsuarioController getPojo() {
		return usercontroller;
	}
	

	
	

}
