package uniquindio.estudiantes.bases.Controllers;

import java.util.List;

import uniquindio.estudiantes.bases.Model.BancoPreguntas;
import uniquindio.estudiantes.bases.Model.Tema;
import uniquindio.estudiantes.bases.Model.Usuario;
import uniquindio.estudiantes.bases.Pojos.PreguntasPOJO;

public class PreguntasController {
	
	private PreguntasPOJO pojo;
	
	public PreguntasController() {
		pojo = new PreguntasPOJO();
	}
	
	
	 public List<BancoPreguntas> obtenerBanco(Tema tema , Usuario docente){
		 return pojo.obtenerBanco(tema, docente);
	 }

}
