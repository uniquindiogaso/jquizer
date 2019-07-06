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
	    
	    

}
