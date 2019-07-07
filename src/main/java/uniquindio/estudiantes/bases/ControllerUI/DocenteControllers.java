package uniquindio.estudiantes.bases.ControllerUI;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
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
    private ComboBox<?> comboDocente;

    @FXML
    private ComboBox<?> comoboEstadoE;

    @FXML
    private TextField txtPreguntasBanco;

    @FXML
    private TextField txtPreguntasEvaluacion;

    @FXML
    private Button btnCrearEvaluacion;

    @FXML
    private TextArea txtEnunciadoFV;

    @FXML
    private RadioButton rbtVerdadero;

    @FXML
    private ToggleGroup grupoRespuesta;

    @FXML
    private RadioButton rbtFalso;

    @FXML
    private ComboBox<?> comboTemas;

    @FXML
    private TextArea txtEnunciadoSeleccion;

    @FXML
    private TextArea txtEnunciadoEmparejar;

    @FXML
    private Button btnAgregar;

    @FXML
    private TableView<?> tableBancoPublico;

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
