package uniquindio.estudiantes.bases.ControllerUI;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import uniquindio.estudiantes.bases.Controllers.TemasController;
import uniquindio.estudiantes.bases.Model.Persona;
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
    private ComboBox<Persona> comboDocente;

    @FXML
    private ComboBox<?> comoboEstadoE;

    @FXML
    private TextField txtPreguntasBanco;

    @FXML
    private TextField txtPreguntasEvaluacion;

    @FXML
    private Button btnCrearEvaluacion;

    @FXML
    private ComboBox<Tema> comboTemas2;

    @FXML
    private TextArea txtEnunciadoFV;

    @FXML
    private RadioButton rbtVerdadero;

    @FXML
    private ToggleGroup grupoRespuesta;

    @FXML
    private RadioButton rbtFalso;

    @FXML
    private ComboBox<Tema> comboTemas;

    @FXML
    private CheckBox checkPublicaVoF;

    @FXML
    private TextArea txtEnunciadoSeleccion;

    @FXML
    private CheckBox checkPublica;

    @FXML
    private TextArea txtEnunciadoEmparejar;

    @FXML
    private Button btnAgregar;

    @FXML
    private CheckBox checkPublicaE;

    @FXML
    private TableView<?> tableBancoPublico;

    @FXML
    private ComboBox<Tema> comboTemas1;

    @FXML
    private TableView<?> tableBancoPrivado;

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

	public DocenteControllers() {
		cargarTemas();
		cargarDocentes();
	}
	
	@FXML
	void cargarTemas () {
		
		try {
			
			ObservableList<Tema> temas = FXCollections.observableArrayList();
			
			List<Tema> t = manejador.getTemasController().obtenerTemas();
			
			System.out.println("Temas = " + t.size());
			for(Tema tx : t ) {
				System.out.println("tema " + tx.getNombre());
			}
			
			temas.addAll(manejador.getTemasController().obtenerTemas());
			comboTemas.setItems(temas);
			comboTemas1.setItems(temas);
			comboTemas2.setItems(temas);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("no carga " + e.getMessage());
			
			e.getStackTrace();
			
		}

	}
	
	@FXML
	void cargarDocentes(){
		
		try {

			ObservableList<Persona> personas = FXCollections.observableArrayList();
			
			List<Persona> t = manejador.getPojo().getDocentes();
			
			personas.addAll(manejador.getPojo().getDocentes());
			comboDocente.setItems(personas);
			
			comboDocente.getSelectionModel();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("no carga " + e.getMessage());
			
			e.getStackTrace();
			
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
