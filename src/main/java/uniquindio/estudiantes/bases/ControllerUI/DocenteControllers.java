package uniquindio.estudiantes.bases.ControllerUI;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;
import uniquindio.estudiantes.bases.Model.Evaluacion;
import uniquindio.estudiantes.bases.Model.Persona;
import uniquindio.estudiantes.bases.Model.Pregunta;
import uniquindio.estudiantes.bases.Model.Tema;
import uniquindio.estudiantes.bases.Model.Usuario;

public class DocenteControllers {

	@FXML
	private TextField txtNombreE;

	@FXML
	private TextArea txtDescripcion;

	@FXML
	private ToggleGroup grupoEvaluacion;

	@FXML
	private DatePicker PickFechaI;

	@FXML
	private DatePicker PickFechaF;

	@FXML
	private TextField txtDuracion;

	@FXML
	private Button btnCrearEvaluacion;

	@FXML
	private ComboBox<Tema> comboTemas2;

	@FXML
	private ComboBox<?> comboPBanco;

	@FXML
	private Button btnAgregar;

	@FXML
	private TableView<Pregunta> tablePreguntas;

	@FXML
	private TableColumn<Pregunta, Integer> columCodigo;

	@FXML
	private TableColumn<Pregunta, String> columNombre;

	@FXML
	private TableColumn<Pregunta, Boolean> columPublica;

	@FXML
	private TableColumn<Pregunta, Float> columValor;

	@FXML
	private TableColumn<Pregunta, Integer> columTiempo;

	@FXML
	private AnchorPane bancoPublico;

	@FXML
	private TableView<?> tableBancoPublico;

	@FXML
	private ComboBox<Tema> comboTemas1;

	@FXML
	private AnchorPane bancoPrivado;

	@FXML
	private TableView<?> tableBancoPrivado;

	@FXML
	private ComboBox<Tema> comboTemas;

	@FXML
	private TableView<?> tableEstudiantes;

	@FXML
	private Button btnDescargar;

	@FXML
	private ComboBox<?> comboGrupo;

	@FXML
	private TableView<?> tableHorario;

	@FXML
	private TableView<?> tableReporteCurso;

	@FXML
	private RadioButton rbtExamen;

	@FXML
	private RadioButton rbtQuiz;

	ObservableList<Pregunta> preguntas = FXCollections.observableArrayList();

	private Manejador manejador;

	private Stage escenario;

	private Usuario user;

//-----------------------------------------Metodos------------------------------------------------------------------------

	public DocenteControllers() {
	}

	public void initialize() {

		// cargarTemas();

	}

	@FXML
	void cargarTemas() {

		try {

			ObservableList<Tema> temas = FXCollections.observableArrayList();
			manejador.getTemasController().obtenerTemas().forEach(xx -> {
				temas.add(xx);
			});

			comboTemas.setItems(temas);
			comboTemas1.setItems(temas);
			comboTemas2.setItems(temas);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("no ttt carga " + e.getMessage());

			e.getStackTrace();

		}

	}

	@FXML
	void cargarPreguntas() {

		try {

			tablePreguntas.setItems(preguntas);
			columCodigo.setCellValueFactory(new PropertyValueFactory<Pregunta, Integer>("id"));
			columNombre.setCellValueFactory(new PropertyValueFactory<Pregunta, String>("nombre"));
			columPublica.setCellValueFactory(new PropertyValueFactory<Pregunta, Boolean>("publica"));
			columTiempo.setCellValueFactory(new PropertyValueFactory<Pregunta, Integer>("tiempo"));
			columValor.setCellValueFactory(new PropertyValueFactory<Pregunta, Float>("valor"));

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("no carga " + e.getMessage());

			e.getStackTrace();

		}
	}

	@FXML
	void cargarEmparejar(ActionEvent event) {

		Tema tema = comboTemas2.getValue();

		manejador.cargarEscenarioEmparejar(user, tema);

	}

	@FXML
	void cargarSeleccionar(ActionEvent event) {

		Tema tema = comboTemas2.getValue();
		manejador.cargarEscenarioSeleccionar(user, tema);

	}

	@FXML
	void cargarVoF(ActionEvent event) {

		Tema tema = comboTemas2.getValue();
		manejador.cargarEscenarioVoF(user, tema);

	}

	@FXML
	void mostrarBancoPrivado(ActionEvent event) {

		bancoPrivado.setVisible(true);
		bancoPublico.setVisible(false);

	}

	@FXML
	void mostrarBancoPublico(ActionEvent event) {

		bancoPublico.setVisible(true);
		bancoPrivado.setVisible(false);

	}

	@FXML
	void crearEvaluacion(ActionEvent event) {

		Tema tema = comboTemas2.getSelectionModel().getSelectedItem();

		Evaluacion evaluacion = new Evaluacion();
		evaluacion.setDuracion(Integer.parseInt(txtDuracion.getText()));
		evaluacion.setDescripcion(txtDescripcion.getText());
		evaluacion.setNombre(txtNombreE.getText());
		evaluacion.setDocente_id(user.getId());

		// acomodar para capturar La fecha como Date
		// evaluacion.setF_inicio();
		// evaluacion.setF_fin(f_fin);
		evaluacion.setTema(tema);

		if (rbtExamen.isSelected()) {

			evaluacion.setTipo("Examen");

		}

		if (rbtQuiz.isSelected()) {

			evaluacion.setTipo("Quiz");

		}

		manejador.getEvaluacionController().guardarExamen(evaluacion, preguntas);

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
		cargarTemas();
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
	 * @return the tablePreguntas
	 */
	public TableView<Pregunta> getTablePreguntas() {
		return tablePreguntas;
	}

	/**
	 * @param tablePreguntas the tablePreguntas to set
	 */
	public void setTablePreguntas(TableView<Pregunta> tablePreguntas) {
		this.tablePreguntas = tablePreguntas;
	}

	/**
	 * @return the preguntas
	 */
	public ObservableList<Pregunta> getPreguntas() {
		return preguntas;
	}

	/**
	 * @param preguntas the preguntas to set
	 */
	public void setPreguntas(ObservableList<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}	

}
