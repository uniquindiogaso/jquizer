package uniquindio.estudiantes.bases.ControllerUI;

import java.net.URL;
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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;

import uniquindio.estudiantes.bases.Model.Persona;
import uniquindio.estudiantes.bases.Model.Tema;
import uniquindio.estudiantes.bases.Model.Usuario;

public class DocenteControllers{

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
	    private TableView<String> tablePreguntas;

	    @FXML
	    private TableColumn<?, ?> columCodigo;

	    @FXML
	    private TableColumn<?, ?> columNombre;

	    @FXML
	    private TableColumn<?, ?> columPublica;

	    @FXML
	    private TableColumn<?, ?> columValor;

	    @FXML
	    private TableColumn<?, ?> columTiempo;

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

	private Manejador manejador;

	private Stage escenario;

	private Usuario user;
	

//-----------------------------------------Metodos------------------------------------------------------------------------

	public DocenteControllers() {}
	
	public void initialize() {
		
		//cargarTemas();
		
	}

	@FXML
	void cargarTemas() {

		try {

			ObservableList<Tema> temas = FXCollections.observableArrayList();
			manejador.getTemasController().obtenerTemas().forEach(xx->{
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

//	@FXML
//	void cargarDocentes() {
//
//		try {
//
//			ObservableList<Persona> personas = FXCollections.observableArrayList();
//
//			personas.addAll(manejador.getPojo().getDocentes());
//			comboDocente.getItems().addAll(personas);;
//
//
//		} catch (Exception e) {
//			// TODO: handle exception
//
//			System.out.println("no carga " + e.getMessage());
//
//			e.getStackTrace();
//
//		}
//
//	}

	@FXML
	void cargarEmparejar(ActionEvent event) {
		
		Tema tema = comboTemas2.getSelectionModel().getSelectedItem();

		manejador.cargarEscenarioEmparejar(user, tema);

	}

	@FXML
	void cargarSeleccionar(ActionEvent event) {

		Tema tema = comboTemas2.getSelectionModel().getSelectedItem();
		manejador.cargarEscenarioSeleccionar(user, tema);

	}

	@FXML
	void cargarVoF(ActionEvent event) {
		
		Tema tema = comboTemas2.getSelectionModel().getSelectedItem();
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
	
//	@FXML
//	void crearEvaluacion() {
//
//	}

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
	public TableView<String> getTablePreguntas() {
		return tablePreguntas;
	}


	/**
	 * @param tablePreguntas the tablePreguntas to set
	 */
	public void setTablePreguntas(TableView<String> tablePreguntas) {
		this.tablePreguntas = tablePreguntas;
	}

	

}
