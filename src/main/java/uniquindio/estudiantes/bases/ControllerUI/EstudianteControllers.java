package uniquindio.estudiantes.bases.ControllerUI;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import uniquindio.estudiantes.bases.Model.Usuario;

public class EstudianteControllers {
	
    @FXML
    private TableView<?> tableHorario;

    @FXML
    private TableView<?> tablePresentarExamen;

    @FXML
    private Button btnAcceder;

    @FXML
    private TableView<?> tableNotas;
    
	private Manejador manejador;
	
	private Stage escenario;
	
	private Usuario user;

//-----------------------------------------Metodos------------------------------------------------------------------------

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

	/**
	 * @return the user
	 */
	public Usuario getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(Usuario user) {
		this.user = user;
	}
	
}
