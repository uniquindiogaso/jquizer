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

	
	public List<Evaluacion> evaluacionesPendientes(int estudianteId){
		return pojo.evaluacionesXEstudiante(estudianteId);
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

		int evaluacionId = pojo.insertar(e);
		System.out.println("1. ID de Evaluacion Persistida " + evaluacionId);
		e.setId(evaluacionId);
		
		System.out.println("2. ID de Evaluacion Persistida " + e.getId());

		if (e.getId() != -1) {
			for (Pregunta p : preguntas) {
				/*
				 * emparejar seleccion_multiple ordenar F_V
				 */
				TipoPregunta tipoPregunta = preguntaController.obtenerTipoPreguntaXId(p.getTipo_preg_id());
				if ("F_V".equals(tipoPregunta.getCodinterno())) {
					guardarPreguntaFalsoVerd(p, e);
				} else if ("emparejar".equals(tipoPregunta.getCodinterno())) {
					// todo
				} else if ("seleccion_multiple".equals(tipoPregunta.getCodinterno())) {
					// todo
				} else if ("ordenar".equals(tipoPregunta.getCodinterno())) {
					// todo
				} else {
					// todo : si no entra a ninguna la pregunta viene SIN PARAMETROS CORRECTOS
				}

			}
		} else {
			return false;
		}

		return true;
	}

	private boolean guardarPreguntaFalsoVerd(Pregunta p, Evaluacion evaluacion) {
		int preguntaId = preguntaPOJO.insertarPregunta(p);
				
		boolean exitoPreguntXEval = guardarpreguntaXEvaluacion(preguntaId, evaluacion.getId());

		boolean exitoBancoPreguntas = guardarBancoPreguntas(preguntaId, evaluacion.getDocente_id() , p.getTema_id());
		
		for( OpcionPregunta opPregunta : p.getOpcionPreguntas()) {
			opPregunta.setPregunta_id(preguntaId);
			opPregunta.setDescripcion(opPregunta.isCorrecta() ? "Verdadera" : "Falsa");
			guardarOpcionPregunta(opPregunta);
		}


		return exitoPreguntXEval && exitoBancoPreguntas;
	}

	private boolean guardarpreguntaXEvaluacion(int preguntaId, int evaluacionId) {
		int pregXEvaluacion_id = preguntaPOJO.insertarPreguntaXEvaluacion(preguntaId, evaluacionId);
		return pregXEvaluacion_id != -1;
	}

	private boolean guardarBancoPreguntas(int temaId, int preguntaId, int propietarioId) {
		int bancoXPregunta = preguntaPOJO.insertarBancoPreguntas(temaId, preguntaId, propietarioId);
		return bancoXPregunta != -1;
	}

	private boolean guardarOpcionPregunta(OpcionPregunta op) {
		int opcionPregunta = preguntaPOJO.insertarOpcionPregunta(op);
		return opcionPregunta != -1;
	}

}
