package uniquindio.estudiantes.bases.ControllerUI;

import javax.swing.JOptionPane;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import uniquindio.estudiantes.bases.Model.Pregunta;
import uniquindio.estudiantes.bases.Model.Tema;
import uniquindio.estudiantes.bases.Model.Usuario;

public class VoFControllers {

	@FXML
	private TextArea txtEnunciado;

	@FXML
	private RadioButton rbtVerdadero;

	@FXML
	private ToggleGroup groupVoF;

	@FXML
	private RadioButton rbtFalso;

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
	void crearPregunta(ActionEvent event) {

		String enunciado = txtEnunciado.getText();

//		if (rbtFalso.isSelected()) {
//
//			if (publica.isSelected()) {
//
//				System.out.println(enunciado);
//				System.out.println(tema.getNombre());
//				System.out.println("Publica: " + publica.isSelected());
//				System.out.println("falso");
//
//			} else {
//
//				System.out.println(enunciado);
//				System.out.println(tema.getNombre());
//				System.out.println("Publica: " + publica.isSelected());
//				System.out.println("falso");
//			}
//
//		}
//
//		if (rbtVerdadero.isSelected()) {
//
//			if (publica.isSelected()) {
//
//				System.out.println(enunciado);
//				System.out.println(tema.getNombre());
//				System.out.println("Publica: " + publica.isSelected());
//				System.out.println("Verdadero");
//
//			} else {
//
//				System.out.println(enunciado);
//				System.out.println(tema.getNombre());
//				System.out.println("Publica: " + publica.isSelected());
//				System.out.println("Verdadero");
//			}
//
//		}
		
		Pregunta pregunta = new Pregunta();
		
		pregunta.setCodinterno("Pregunta Prueba");
		pregunta.setPublica(publica.isSelected());
		pregunta.setTema_id(tema.getId());
		pregunta.setActivo(true);
		pregunta.setNombre(enunciado);
		pregunta.setTiempo(20);
		pregunta.setValor((float)20.0);
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
