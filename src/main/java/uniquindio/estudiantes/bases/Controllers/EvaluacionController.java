package uniquindio.estudiantes.bases.Controllers;

import java.util.Date;
import java.util.List;

import uniquindio.estudiantes.bases.Model.Evaluacion;
import uniquindio.estudiantes.bases.Model.OpcionPregunta;
import uniquindio.estudiantes.bases.Model.Pregunta;
import uniquindio.estudiantes.bases.Model.TipoPregunta;
import uniquindio.estudiantes.bases.Pojos.EvaluacionPOJO;
import uniquindio.estudiantes.bases.Pojos.PreguntasPOJO;
import uniquindio.estudiantes.bases.Pojos.TemasPOJO;

public class EvaluacionController {

	private EvaluacionPOJO pojo;
	private PreguntasPOJO preguntaPOJO;
	private PreguntasController preguntaController;

	public EvaluacionController() {
		super();
		pojo = new EvaluacionPOJO();
		preguntaPOJO = new PreguntasPOJO();
	}

	public boolean guardarExamen(Evaluacion e, List<Pregunta> preguntas) {

		if (0 == preguntas.size()) {
			System.out.println("No se puede guardar examen , no se enviaron preguntas");
			return false;
		}

		preguntaController = new PreguntasController();

		System.out.println("Evaluacion : \n" + e.imprimir());

		for (Pregunta p : preguntas) {
			System.out.println("Preguntas " + p.imprimir());

			for (OpcionPregunta op : p.getOpcionPreguntas()) {
				System.out.println("Preguntas " + op.imprimir());
			}
		}

		e.setF_inicio(new Date());
		e.setF_fin(new Date());

		int idExamen = pojo.insertar(e);

		if (idExamen != -1) {
			for (Pregunta p : preguntas) {
				/*
				 * emparejar seleccion_multiple ordenar F_V
				 */
				TipoPregunta tipoPregunta = preguntaController.obtenerTipoPreguntaXId(p.getTipo_preg_id());
				if ("F_V".equals(tipoPregunta.getCodinterno())){
					guardarPreguntaFalsoVerd(p);
				}else if ("emparejar".equals(tipoPregunta.getCodinterno())){
					//todo
				}else if ("seleccion_multiple".equals(tipoPregunta.getCodinterno())){
					//todo
				}else if ("ordenar".equals(tipoPregunta.getCodinterno())){
					//todo
				}else {
					//todo : si no entra a ninguna la pregunta viene SIN PARAMETROS CORRECTOS
				}
				
				
				
			}
		} else {
			return false;
		}

		return true;
	}
	
	public boolean guardarPreguntaFalsoVerd(Pregunta p) {
		int preguntaId = preguntaPOJO.insertarPregunta(p);
		
		if (p.isPublica()) {
			//enviar a banco de preguntas... ¿anque no ese publica? ... creo que si...
		}
		return true;
	}

}
