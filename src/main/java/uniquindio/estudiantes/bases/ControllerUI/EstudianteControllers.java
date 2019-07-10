package uniquindio.estudiantes.bases.ControllerUI;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import uniquindio.estudiantes.bases.Model.Evaluacion;
import uniquindio.estudiantes.bases.Model.Pregunta;
import uniquindio.estudiantes.bases.Model.ResEstudiante;
import uniquindio.estudiantes.bases.Model.ResPreguntasEvaluacion;
import uniquindio.estudiantes.bases.Model.Tema;
import uniquindio.estudiantes.bases.Model.Usuario;

public class EstudianteControllers {

	@FXML
	private TableView<Evaluacion> tablePresentarExamen;

	@FXML
	private TableColumn<Evaluacion, String> columNombre;

	@FXML
	private TableColumn<Evaluacion, Tema> columTema;

	@FXML
	private TableColumn<Evaluacion, String> columTipo;

	@FXML
	private TableColumn<Evaluacion, Date> columInicio;

	@FXML
	private TableColumn<Evaluacion, Date> columFin;

	@FXML
	private Button btnAcceder;

	@FXML
	private Button btnActualizar;

	@FXML
	private TableView<?> tableNotas;

	@FXML
	private TableView<?> tablePesoNotas;
	
    @FXML
    private ComboBox<Evaluacion> comboEvaluaciones;
	
	ObservableList<Evaluacion> evaluaciones = FXCollections.observableArrayList();
		
	List<ResEstudiante> respuestas = new ArrayList<>();

	private Manejador manejador;

	private Stage escenario;

	private Usuario user;

//-----------------------------------------Metodos------------------------------------------------------------------------
        
	@FXML
	void actualizarEvaluacion() {

		

		ObservableList<Evaluacion> evaluacion = FXCollections.observableArrayList();
		manejador.getEvaluacionController().evaluacionesPendientes(user.getId()).forEach(xx -> {
			evaluacion.add(xx);
		});
		
		comboEvaluaciones.setItems(evaluacion);

	}

	@FXML
	void cargarPreguntaVoF() {

		List<ResPreguntasEvaluacion> preguntas = manejador.getPreguntasController().obtenerPreguntasEvaluacion(comboEvaluaciones.getValue().getId());
		System.out.println("[cargarPreguntaVoF] " + preguntas.size());
		Integer id = comboEvaluaciones.getValue().getId();
		
		manejador.cargarEscenarioResponderVoF(preguntas, id);

	}
	
	@FXML
	void cargarPreguntaSeleccion() {

	//	manejador.cargarEscenarioResponderSeleccion(respuestas);

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
	 * @return the respuestas
	 */
	public List<ResEstudiante> getRespuestas() {
		return respuestas;
	}

	/**
	 * @param respuestas the respuestas to set
	 */
	public void setRespuestas(List<ResEstudiante> respuestas) {
		this.respuestas = respuestas;
	}


	
	

}
