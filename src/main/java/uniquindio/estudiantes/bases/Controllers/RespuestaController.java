package uniquindio.estudiantes.bases.Controllers;

import java.util.List;

import uniquindio.estudiantes.bases.Model.ResEstudiante;

public class RespuestaController {

	
	public boolean insertarRespuesta(ResEstudiante res) {
		System.out.println("res " + res.imprimir());
		return true;
	}
	
	public boolean insertarRespuesta(List<ResEstudiante> res) {
		System.out.println("Se reciben " + res.size() + " respuestas");	
		for(ResEstudiante r : res) {
			System.out.println("e) " + r.imprimir());
		}
	
		return true;
		
	}
	
}
