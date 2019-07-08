package uniquindio.estudiantes.bases.ControllerUI;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import uniquindio.estudiantes.bases.Model.Usuario;

public class AdminControllers {
	
    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtDocumento;

    @FXML
    private TextField txtEmail;

    @FXML
    private ComboBox<?> comboGrupoD;

    @FXML
    private ComboBox<?> comboCiudad;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtNombre1;

    @FXML
    private TextField txtApellido1;

    @FXML
    private TextField txtDocumento1;

    @FXML
    private TextField txtEmail1;

    @FXML
    private ComboBox<?> comboCursoE;

    @FXML
    private ComboBox<?> comboCiudad1;

    @FXML
    private TextField txtTelefono1;

    @FXML
    private TextField txtNombreCurso;

    @FXML
    private TextField txtIntensidad;

    @FXML
    private TextArea txtDescripcionCurso;

    @FXML
    private ComboBox<?> comboEstado;

    @FXML
    private TextField txtIdCurso;

    @FXML
    private Button btnAgregarCurso;

    @FXML
    private TextField txtNombreGrupo;

    @FXML
    private TextField txtAñoGrupo;

    @FXML
    private TextField txtIdGrupo;

    @FXML
    private TextField txtCodInternoGrupo;

    @FXML
    private ComboBox<?> comboCursos;

    @FXML
    private Button btnAgregarGrupo;
    
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
