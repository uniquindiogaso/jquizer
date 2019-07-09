package uniquindio.estudiantes.bases.ControllerUI;

import java.net.URL;
import java.util.ResourceBundle;

import com.sun.glass.events.MouseEvent;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import uniquindio.estudiantes.bases.Model.Persona;
import uniquindio.estudiantes.bases.Model.Tema;
import uniquindio.estudiantes.bases.Model.Usuario;

public class AdminControllers implements Initializable {
	
	   @FXML
	    private TextField txtNombreD;

	    @FXML
	    private TextField txtApellidoD;

	    @FXML
	    private TextField txtDocumentoD;

	    @FXML
	    private TextField txtEmailD;

	    @FXML
	    private ComboBox<?> comboCiudadD;

	    @FXML
	    private TextField txtTelefonoD;

	    @FXML
	    private Button btnRegistrarD;

	    @FXML
	    private TextField txtNombreE;

	    @FXML
	    private TextField txtApellidoE;

	    @FXML
	    private TextField txtDocumentoE;

	    @FXML
	    private TextField txtEmailE;

	    @FXML
	    private ComboBox<?> comboCiudadE;

	    @FXML
	    private TextField txtTelefonoE;

	    @FXML
	    private Button btnRegistrarA;

	    @FXML
	    private TextField txtNombreCurso;

	    @FXML
	    private TextField txtIntensidadCurso;

	    @FXML
	    private TextArea txtDescripcionCurso;

	    @FXML
	    private ComboBox<?> comboEstadoCurso;

	    @FXML
	    private TextField txtIdCurso;

	    @FXML
	    private Button btnAgregarCurso;

	    @FXML
	    private TableView<Persona> tableDocente;

	    @FXML
	    private TableColumn<Persona, String> columNombreDocente;

	    @FXML
	    private TableColumn<Persona, Integer> columCodigoDocente;

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

	    @FXML
	    private TableView<Persona> tableEstudiante;

	    @FXML
	    private TableColumn<Persona, String> columNombreEstudiante;

	    @FXML
	    private TableColumn<Persona, Integer> columCodigoEstudiante;
	    
	    @FXML
	private Tab tabCursos;
    
	private Manejador manejador;
	
	private Stage escenario;
	
	private Usuario user;
	
//-----------------------------------------Metodos------------------------------------------------------------------------

	public AdminControllers() {
	
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		cargarDocentes();
		cargarEstudiantes();
		
	}
	
    @FXML
    void  cargarDocentes() {
    	
		try {

			ObservableList<Persona> docentes = FXCollections.observableArrayList();
			
			for (int i = 0; i < docentes.size(); i++) {
				System.out.println(docentes.get(i).getNombre());
			}

			docentes.addAll(manejador.getPojo().getDocentes());
			
			tableDocente.setItems(docentes);
			columNombreDocente.setCellValueFactory(new PropertyValueFactory<Persona, String>("nombre"));
			columCodigoDocente.setCellValueFactory(new PropertyValueFactory<Persona, Integer>("id"));
			

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("no carga " + e.getMessage());

			e.getStackTrace();

		}
	}
    
    @FXML
    void  cargarEstudiantes() {
    	
		try {

			ObservableList<Persona> estudiantes = FXCollections.observableArrayList();
			
			for (int i = 0; i < estudiantes.size(); i++) {
				System.out.println(estudiantes.get(i).getNombre());
			}

			estudiantes.addAll(manejador.getPojo().getDocentes());
			
			tableEstudiante.setItems(estudiantes);
			columNombreEstudiante.setCellValueFactory(new PropertyValueFactory<Persona, String>("nombre"));
			columCodigoEstudiante.setCellValueFactory(new PropertyValueFactory<Persona, Integer>("id"));

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("no carga " + e.getMessage());

			e.getStackTrace();

		}
	}

	@FXML
	void registrarDocente() {}



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
