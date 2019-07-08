package uniquindio.estudiantes.bases.ControllerUI;

import java.io.IOException;
import java.util.List;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import uniquindio.estudiantes.bases.Controllers.TemasController;
import uniquindio.estudiantes.bases.Controllers.UsuarioController;
import uniquindio.estudiantes.bases.Main.Main;
import uniquindio.estudiantes.bases.Model.Tema;
import uniquindio.estudiantes.bases.Model.Usuario;
import uniquindio.estudiantes.bases.Pojos.TemasPOJO;
import uniquindio.estudiantes.bases.Pojos.UsuarioPOJO;

public class Manejador {
	
	private Stage escenario;
	
	private UsuarioController usercontroller;
	
	private TemasController temasController;
	
	private TemasPOJO temasPOJO;

//-----------------------------------------Metodos------------------------------------------------------------------------
	
	public Manejador (Stage escenario){
		
		this.escenario = escenario;
		usercontroller = new UsuarioController();
		cargarEscenarioLogin();
		temasController = new TemasController();
		temasController = new TemasController();
		
	}
	
	public void cargarEscenarioLogin(){
		
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
			
		} catch(IOException e){
			
			e.printStackTrace();
			
		}
	}
	
	public void cargarEscenarioDocente(Usuario usuario){
		
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
			
		} catch(IOException e){
			
			e.printStackTrace();
			
		}
	}
	
	public void cargarEscenarioAdmin(Usuario usuario){
		
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
			
		} catch(IOException e){
			
			e.printStackTrace();
			
		}
	}
	
	public void cargarEscenarioEstudiante(Usuario usuario){
		
		try {
			
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("../View/Estudiante.fxml"));
			Stage stage = new Stage();
			Parent root = loader.load();
			
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.show();
			
			EstudianteControllers estudiante = loader.getController();
			estudiante.setEscenario(stage);
			estudiante.setManejador(this);
			estudiante.setUser(usuario);
			
		} catch(IOException e){
			
			e.printStackTrace();
			
		}
	}
	
	
	
	
//---------------------------------Get`s and Set`s------------------------------------------------------------------------


	public UsuarioController getPojo() {
		return usercontroller;
	}

	/**
	 * @return the temasController
	 */
	public TemasController getTemasController() {
		return temasController;
	}

	/**
	 * @param temasController the temasController to set
	 */
	public void setTemasController(TemasController temasController) {
		this.temasController = temasController;
	}

	/**
	 * @return the temasPOJO
	 */
	public TemasPOJO getTemasPOJO() {
		return temasPOJO;
	}

	/**
	 * @param temasPOJO the temasPOJO to set
	 */
	public void setTemasPOJO(TemasPOJO temasPOJO) {
		this.temasPOJO = temasPOJO;
	}



	
	

}
