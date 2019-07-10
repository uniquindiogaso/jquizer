package uniquindio.estudiantes.bases.Controllers;

import java.util.List;

import uniquindio.estudiantes.bases.Model.OpcionPregunta;
import uniquindio.estudiantes.bases.Model.ResEstudiante;
import uniquindio.estudiantes.bases.Model.TipoPregunta;
import uniquindio.estudiantes.bases.Pojos.PreguntasPOJO;
import uniquindio.estudiantes.bases.Pojos.RespuestaPOJO;

public class RespuestaController {
	
	PreguntasPOJO preguntaPOJO;
	RespuestaPOJO respuestaPOJO;
	
			
	public RespuestaController() {
		super();
		preguntaPOJO = new PreguntasPOJO();
		respuestaPOJO = new RespuestaPOJO();
	}

	public boolean insertarRespuesta(ResEstudiante res) {
		System.out.println("res " + res.imprimir());
		return true;
	}
	
	public boolean insertarRespuesta(List<ResEstudiante> res) {
		System.out.println("Se reciben " + res.size() + " respuestas");	
		for(ResEstudiante r : res) {
			System.out.println("e) " + r.imprimir());
			
			TipoPregunta tipoPregunta = preguntaPOJO.obtenerTipoPreguntaXPregunta(r.getEvaluacion_id());
			//preguntaPOJO.obtenerPreguntaEvaluacion(r.getEvaluacion_id() , r.get)
			
			if ("F_V".equals(tipoPregunta.getCodinterno())) {				
				OpcionPregunta op = preguntaPOJO.obtenerOpcionPreguntaXPregunta(r.getEvaluacion_id());
				
			}		
		}
	
		return true;
		
	}
	
}
