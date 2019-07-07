package uniquindio.estudiantes.bases.ControllerUI;


import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import uniquindio.estudiantes.bases.StartApp;
import uniquindio.estudiantes.bases.Controllers.UsuarioController;
import uniquindio.estudiantes.bases.Main.Main;
import uniquindio.estudiantes.bases.Model.Usuario;

public class LoginControllers {

	UsuarioController usuarioController;

	@FXML
	private TextField txtUser;
	
	@FXML
	private PasswordField txtPass;

	@FXML
	private ImageView imgLogin;

	@FXML
	private Button btnIngresar;
	
	
	private Manejador manejador;
	
	private Stage escenario;
	
//-----------------------------------------Metodos------------------------------------------------------------------------
	
	@FXML
    void validarLogin(ActionEvent event) {

		String usuario = txtUser.getText();
		String contrasena = txtPass.getText();
		
		Usuario user = manejador.validarLogin(usuario, contrasena);
		
		String tipo = user.getPersona().getTipo();
		
		if(user!=null && tipo.equals("Propietario") )
		{
			escenario.close();
			manejador.cargarEscenarioAdmin(user);
		}
		else
		{
			System.out.println(" paila ");
		}
		
		
    }
	
//---------------------------------Get`s and Set`s------------------------------------------------------------------------
	

	/**
	 * @return the manejador
	 */
	public Manejador getManejador() {
		return manejador;
	}

	/**
	 * @param manejador the manejador to set
	 */
	public void setManejador(Manejador manejador) {
		this.manejador = manejador;
	}

	/**
	 * @return the escenario
	 */
	public Stage getEscenario() {
		return escenario;
	}

	/**
	 * @param escenario the escenario to set
	 */
	public void setEscenario(Stage escenario) {
		this.escenario = escenario;
	}

	
	
	
}
