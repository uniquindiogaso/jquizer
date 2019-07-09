package uniquindio.estudiantes.bases.ControllerUI;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
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

	private Manejador manejador;

	private Stage escenario;

	private Usuario user;

	private Tema tema;

//-----------------------------------------Metodos------------------------------------------------------------------------

	@FXML
	void crearPregunta(ActionEvent event) {
		String pregunta = null;

		String enunciado = txtEnunciado.getText();
		
		System.out.println(enunciado);

		if (!check1.isSelected() && !check2.isSelected() && !check3.isSelected() && !check4.isSelected()
				&& !check5.isSelected()) {

			JOptionPane.showMessageDialog(null, "Seleccione Respuesta");

		}

		if (publica.isSelected()) {

			System.out.println("publica: " + publica.isSelected());

		} else if (!publica.isSelected()) {

			System.out.println("publica: " + publica.isSelected());

		}

		if (check1.isSelected()) {
			
			System.out.println("Opcion 1: correcta "+ txtOpcion1.getText());
			
		}
		
		if (check2.isSelected()) {
			
			System.out.println("Opcion 2: correcta "+ txtOpcion2.getText());
			
		}
		
		if (check3.isSelected()) {
			
			System.out.println("Opcion 3: correcta "+ txtOpcion3.getText());
			
		}
		
		if (check4.isSelected()) {
			
			System.out.println("Opcion 4: correcta "+ txtOpcion4.getText());
			
		}
		
		if (check5.isSelected()) {
			
			System.out.println("Opcion 5: correcta "+ txtOpcion5.getText());
			
		}


		//getDocenteControllers().getTablePreguntas().getItems().add(pregunta);

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

}
