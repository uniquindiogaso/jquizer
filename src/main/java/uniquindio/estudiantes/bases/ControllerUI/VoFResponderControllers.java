package uniquindio.estudiantes.bases.ControllerUI;

import java.util.ArrayList;
import java.util.List;

import com.sun.javafx.font.Disposer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import uniquindio.estudiantes.bases.Model.Pregunta;
import uniquindio.estudiantes.bases.Model.ResEstudiante;
import uniquindio.estudiantes.bases.Model.ResPreguntasEvaluacion;
import uniquindio.estudiantes.bases.Model.Usuario;
import uniquindio.estudiantes.bases.Utiles.Res;

public class VoFResponderControllers {

	@FXML
	private Button btnSiguiente;
	
	@FXML
	private Button btnFinalizar;

	@FXML
	private TextArea txtEnunciado;

	@FXML
	private RadioButton rbtVerdadero;

	@FXML
	private ToggleGroup groupRespuesta;

	@FXML
	private RadioButton rbtFalso;
	
	private EstudianteControllers estudianteControllers;
	
	private Manejador manejador;

	private Stage escenario;
	
	private List<ResPreguntasEvaluacion> preguntas;
	
	private List<ResEstudiante> respuestas;
	
	private Integer idEvaluacion;

	//private Usuario user;
	



//-----------------------------------------Metodos------------------------------------------------------------------------

	public VoFResponderControllers() {
	 respuestas = new ArrayList<ResEstudiante>();
	}
	
	
	void initialize() {
		System.out.println(preguntas.size());
		System.out.println("hola");
		txtEnunciado.setText(preguntas.get(0).getNombre());
		System.out.println(preguntas.get(0).imprimir());
	}
	


	
	@FXML
	void contestar(ActionEvent event) {
		
		if(preguntas.size() == 2) {
			
			btnFinalizar.setVisible(true);
			btnSiguiente.setVisible(false);
			
		}
		
		ResEstudiante respuesta = new ResEstudiante();
		
		boolean correcta = true ;
		
		if (rbtFalso.isSelected()) {
			
			correcta = false;
			
		}
		
		if (rbtVerdadero.isSelected()) {
			
			correcta = true;
			
		}
		
		
		respuesta.setEvaluacion_id(idEvaluacion);
		respuesta.setResBoolean(correcta);
		respuesta.setPre_eval_id(preguntas.get(0).getPre_eval_id());
		
		respuestas.add(respuesta);
		
		preguntas.remove(0);
		
		initialize();

	}
	
	@FXML
	void terminarSeccion(){
		
		estudianteControllers.getRespuestas().addAll(respuestas);
		getEscenario().close();
		
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

//	/**
//	 * @return the user
//	 */
//	public Usuario getUser() {
//		return user;
//	}
//
//	/**
//	 * @param user the user to set
//	 */
//	public void setUser(Usuario user) {
//		this.user = user;
//	}

	/**
	 * @return the preguntas
	 */
	public List<ResPreguntasEvaluacion> getPreguntas() {
		return preguntas;
		
	}

	/**
	 * @param preguntas the preguntas to set
	 */
	public void setPreguntas(List<ResPreguntasEvaluacion> preguntas) {
		this.preguntas = preguntas;
	}


	/**
	 * @return the estudianteControllers
	 */
	public EstudianteControllers getEstudianteControllers() {
		return estudianteControllers;
	}


	/**
	 * @param estudianteControllers the estudianteControllers to set
	 */
	public void setEstudianteControllers(EstudianteControllers estudianteControllers) {
		this.estudianteControllers = estudianteControllers;
	}


	/**
	 * @return the idEvaluacion
	 */
	public Integer getIdEvaluacion() {
		return idEvaluacion;
	}


	/**
	 * @param idEvaluacion the idEvaluacion to set
	 */
	public void setIdEvaluacion(Integer idEvaluacion) {
		this.idEvaluacion = idEvaluacion;
	}
	
	
	
}
