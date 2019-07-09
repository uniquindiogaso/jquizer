package uniquindio.estudiantes.bases.ControllerUI;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import uniquindio.estudiantes.bases.Model.Tema;
import uniquindio.estudiantes.bases.Model.Usuario;

public class EmparejarControllers {
	
    @FXML
    private TextField txtopcion1;

    @FXML
    private TextField txtPareja1;

    @FXML
    private TextField txtopcion2;

    @FXML
    private TextField txtPareja2;

    @FXML
    private TextField txtopcion3;

    @FXML
    private TextField txtopcion4;

    @FXML
    private TextField txtopcion5;

    @FXML
    private TextField txtPareja3;

    @FXML
    private TextField txtPareja4;

    @FXML
    private TextField txtPareja5;
    
	private Manejador manejador;
	
	private Stage escenario;
	
	private Usuario user;
	
	private Tema tema;
	
	private DocenteControllers docenteControllers;
	
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

	/**
	 * @return the tema
	 */
	public Tema getTema() {
		return tema;
	}

	/**
	 * @param tema the tema to set
	 */
	public void setTema(Tema tema) {
		this.tema = tema;
	}

	/**
	 * @return the docenteControllers
	 */
	public DocenteControllers getDocenteControllers() {
		return docenteControllers;
	}

	/**
	 * @param docenteControllers the docenteControllers to set
	 */
	public void setDocenteControllers(DocenteControllers docenteControllers) {
		this.docenteControllers = docenteControllers;
	}
	
	

}
