package uniquindio.estudiantes.bases.ControllerUI;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import uniquindio.estudiantes.bases.Model.Pregunta;
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

	@FXML
	private Button btnAgregar;

	@FXML
	private CheckBox publica;

	private Manejador manejador;

	private Stage escenario;

	private Usuario user;

	private Tema tema;

	private DocenteControllers docenteControllers;

//-----------------------------------------Metodos------------------------------------------------------------------------

	@FXML
	void agregarPregunta() {

		if (txtopcion1.getText() != null) {

		}

		if (txtopcion2.getText() != null) {

		}

		if (txtopcion3.getText() != null) {

		}

		if (txtopcion4.getText() != null) {

		}

		if (txtopcion5.getText() != null) {

		}

		Pregunta pregunta = new Pregunta();

		pregunta.setCodinterno("Pregunta emparejar");
		pregunta.setPublica(publica.isSelected());
		pregunta.setTema_id(tema.getId());
		pregunta.setActivo(true);
		pregunta.setTiempo(20);
		pregunta.setValor((float) 20.0);
		pregunta.setId(8);
		pregunta.setTipo_preg_id(1);

		getDocenteControllers().getPreguntas().add(pregunta);

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
