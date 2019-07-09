package uniquindio.estudiantes.bases.ControllerUI;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import uniquindio.estudiantes.bases.Model.OpcionPregunta;
import uniquindio.estudiantes.bases.Model.Pregunta;
import uniquindio.estudiantes.bases.Model.Tema;
import uniquindio.estudiantes.bases.Model.Usuario;

public class SeleccionControllers {

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
	private CheckBox publica;

	@FXML
	private Button btnAgregar;
	
    @FXML
    private TextField txtDuracion;

    @FXML
    private TextField txtPeso;

    @FXML
    private TextField txtCodigoInterno;

	private Manejador manejador;

	private Stage escenario;

	private Usuario user;

	private Tema tema;
	
	private DocenteControllers docenteControllers;

//-----------------------------------------Metodos------------------------------------------------------------------------

	@FXML
	void crearPregunta(ActionEvent event) {
		
		Pregunta pregunta = new Pregunta();
		List<OpcionPregunta> opciones = new ArrayList<>();
		
		pregunta.setCodinterno(txtCodigoInterno.getText());
		pregunta.setPublica(publica.isSelected());
		pregunta.setTema_id(tema.getId());
		pregunta.setActivo(true);
		pregunta.setNombre(txtEnunciado.getText());
		pregunta.setTiempo(Integer.parseInt(txtDuracion.getText()));
		pregunta.setValor(Float.valueOf(txtPeso.getText()));
		pregunta.setTipo_preg_id(3);
		
		
		
		if (!txtOpcion1.getText().isEmpty()) {
			
			OpcionPregunta opcionPregunta1 = new OpcionPregunta();
			opcionPregunta1.setCorrecta(check1.isSelected());
			opcionPregunta1.setDescripcion(txtOpcion1.getText());

			opciones.add(opcionPregunta1);
			
		}
		
		if (!txtOpcion2.getText().isEmpty()) {
			
			OpcionPregunta opcionPregunta2 = new OpcionPregunta();
			opcionPregunta2.setCorrecta(check2.isSelected());
			opcionPregunta2.setDescripcion(txtOpcion2.getText());
			
			opciones.add(opcionPregunta2);
			
		}
		
		if (!txtOpcion3.getText().isEmpty()) {
			
			OpcionPregunta opcionPregunta3 = new OpcionPregunta();
			opcionPregunta3.setCorrecta(check3.isSelected());
			opcionPregunta3.setDescripcion(txtOpcion3.getText());
			
			opciones.add(opcionPregunta3);
			
		}
		
		if (!txtOpcion4.getText().isEmpty()) {
			
			OpcionPregunta opcionPregunta4 = new OpcionPregunta();
			opcionPregunta4.setCorrecta(check4.isSelected());
			opcionPregunta4.setDescripcion(txtOpcion4.getText());
			
			opciones.add(opcionPregunta4);
			
		}
		
		if (!txtOpcion5.getText().isEmpty()) {
			
			OpcionPregunta opcionPregunta5 = new OpcionPregunta();
			opcionPregunta5.setCorrecta(check5.isSelected());
			opcionPregunta5.setDescripcion(txtOpcion5.getText());
			
			opciones.add(opcionPregunta5);
			
		}

		pregunta.setOpcionPreguntas(opciones);

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
