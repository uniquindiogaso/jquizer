package uniquindio.estudiantes.bases.ControllerUI;

import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import uniquindio.estudiantes.bases.Model.Pregunta;

public class SeleccionResponderControllers {

	@FXML
	private TextArea txtEnunciado;

	@FXML
	private CheckBox check1;

	@FXML
	private TextField txtOpcion1;

	@FXML
	private TextField txtOpcion2;

	@FXML
	private TextField txtOpcion3;

	@FXML
	private TextField txtOpcion4;

	@FXML
	private TextField txtOpcion5;

	@FXML
	private CheckBox check2;

	@FXML
	private CheckBox check3;

	@FXML
	private CheckBox check4;

	@FXML
	private CheckBox check5;

	@FXML
	private Button btnSiguiente;

	@FXML
	private Button btnFinalizar;
	
	private EstudianteControllers estudianteControllers;
	
	private Manejador manejador;

	private Stage escenario;
	
	private List<Pregunta> preguntas;
	
	private List<Pregunta> respuestas;
	
//-----------------------------------------Metodos------------------------------------------------------------------------


	void initialize() {
		
		txtEnunciado.setText(preguntas.get(0).getNombre());
	}
	
	
	@FXML
	void contestar(ActionEvent event) {
		
		if(preguntas.size() == 2) {
			
			btnFinalizar.setVisible(true);
			btnSiguiente.setVisible(false);
			
		}
		
		Pregunta respuesta = new Pregunta();
		
		respuestas.add(respuesta);
		preguntas.remove(0);
		
		initialize();

	}
	
	@FXML
	void terminarSeccion(){
		
		estudianteControllers.getRespuestas().addAll(respuestas);
		System.exit(0);
		
	}

	
//---------------------------------Get`s and Set`s------------------------------------------------------------------------

	/**
	 * @return the estudianteControllers
	 */
	public EstudianteControllers getEstudianteControllers() {
		return estudianteControllers;
	}


	/**
	 * @param estudianteControllers the estudianteControllers to set
	 */
	public void setEstudianteControllers(EstudianteControllers estudianteControllers) {
		this.estudianteControllers = estudianteControllers;
	}


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
	 * @return the preguntas
	 */
	public List<Pregunta> getPreguntas() {
		return preguntas;
	}


	/**
	 * @param preguntas the preguntas to set
	 */
	public void setPreguntas(List<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}
	
}
