package uniquindio.estudiantes.bases.ControllerUI;

import java.util.ArrayList;
import java.util.List;

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

public class EmparejarControllers {

    @FXML
    private TextField txtopcion1;

    @FXML
    private TextField txtPareja1;

    @FXML
    private TextField txtopcion2;

    @FXML
    private TextField txtPareja2;

    @FXML
    private TextField txtopcion3;

    @FXML
    private TextField txtopcion4;

    @FXML
    private TextField txtopcion5;

    @FXML
    private TextField txtPareja3;

    @FXML
    private TextField txtPareja4;

    @FXML
    private TextField txtPareja5;

    @FXML
    private Button btnAgregar;

    @FXML
    private CheckBox publica;

    @FXML
    private TextField txtDuracion;

    @FXML
    private TextField txtPeso;

    @FXML
    private TextField txtCodigoInterno;

    @FXML
    private TextArea txtEnunciado;

	private Manejador manejador;

	private Stage escenario;

	private Usuario user;

	private Tema tema;

	private DocenteControllers docenteControllers;

//-----------------------------------------Metodos------------------------------------------------------------------------

	
	@FXML
	void agregarPregunta() {

		System.out.println(tema.getId());
		
		Pregunta pregunta = new Pregunta();
		List<OpcionPregunta> opciones = new ArrayList<>();
		
		pregunta.setCodinterno(txtCodigoInterno.getText());
		pregunta.setPublica(publica.isSelected());
		pregunta.setTema_id(tema.getId());
		pregunta.setActivo(true);
		pregunta.setNombre(txtEnunciado.getText());
		pregunta.setTiempo(Integer.parseInt(txtDuracion.getText()));
		pregunta.setValor(Float.valueOf(txtPeso.getText()));
		pregunta.setTipo_preg_id(2);
		
		
		
		if (!txtopcion1.getText().isEmpty()) {
			
			OpcionPregunta opcionPregunta1 = new OpcionPregunta();
			opcionPregunta1.setPareja(txtPareja1.getText());
			opcionPregunta1.setDescripcion(txtopcion1.getText());

			opciones.add(opcionPregunta1);
			
		}
		
		if (!txtopcion2.getText().isEmpty()) {
			
			OpcionPregunta opcionPregunta2 = new OpcionPregunta();
			opcionPregunta2.setPareja(txtPareja2.getText());
			opcionPregunta2.setDescripcion(txtopcion2.getText());
			
			opciones.add(opcionPregunta2);
			
		}
		
		if (!txtopcion3.getText().isEmpty()) {
			
			OpcionPregunta opcionPregunta3 = new OpcionPregunta();
			opcionPregunta3.setPareja(txtPareja3.getText());
			opcionPregunta3.setDescripcion(txtopcion3.getText());
			
			opciones.add(opcionPregunta3);
			
		}
		
		if (!txtopcion4.getText().isEmpty()) {
			
			OpcionPregunta opcionPregunta4 = new OpcionPregunta();
			opcionPregunta4.setPareja(txtPareja4.getText());
			opcionPregunta4.setDescripcion(txtopcion4.getText());
			
			opciones.add(opcionPregunta4);
			
		}
		
		if (!txtopcion5.getText().isEmpty()) {
			
			OpcionPregunta opcionPregunta5 = new OpcionPregunta();
			opcionPregunta5.setPareja(txtPareja5.getText());
			opcionPregunta5.setDescripcion(txtopcion5.getText());
			
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
