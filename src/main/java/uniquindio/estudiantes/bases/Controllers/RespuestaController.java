package uniquindio.estudiantes.bases.Controllers;

import uniquindio.estudiantes.bases.Model.ResEstudiante;

public class RespuestaController {

	
	public boolean insertarRespuesta(ResEstudiante res) {
		System.out.println("res " + res.imprimir());
		return true;
	}
	
}
