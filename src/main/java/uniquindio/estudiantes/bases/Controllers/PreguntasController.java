package uniquindio.estudiantes.bases.Controllers;

import java.util.List;

import org.sql2o.Connection;

import uniquindio.estudiantes.bases.Bd.DbHelper;
import uniquindio.estudiantes.bases.Model.BancoPreguntas;
import uniquindio.estudiantes.bases.Model.ResPreguntasEvaluacion;
import uniquindio.estudiantes.bases.Model.Tema;
import uniquindio.estudiantes.bases.Model.TipoPregunta;
import uniquindio.estudiantes.bases.Model.Usuario;
import uniquindio.estudiantes.bases.Pojos.PreguntasPOJO;
import uniquindio.estudiantes.bases.Pojos.TemasPOJO;

public class PreguntasController {
	
	private PreguntasPOJO pojo;
	private TemasPOJO temaPojo;
	
	public PreguntasController() {
		pojo = new PreguntasPOJO();
		temaPojo = new TemasPOJO();
	}
	
	 public List<BancoPreguntas> obtenerBanco(Tema tema , Usuario docente){
		 return pojo.obtenerBanco(tema, docente);
	 }
	 
	 
	 public List<TipoPregunta> obtenerTiposPreguntaActivos(){
		 return pojo.obtenerTiposActivos();
	 }
	 
	 public TipoPregunta obtenerTipoPregunta(String codigo) {
		 return pojo.obtenerTipoPregunta(codigo);
	 }
	 
	 public TipoPregunta obtenerTipoPreguntaXId(int id) {
		 return pojo.obtenerTipoPreguntaXId(id);
	 }
	 
	 public List<ResPreguntasEvaluacion> obtenerPreguntasEvaluacion(int evaluacionId){
		 
		 List<ResPreguntasEvaluacion> preguntasEval = pojo.getPreguntasEvaluacion(evaluacionId);
		 
		 for(ResPreguntasEvaluacion pregunta : preguntasEval) {			 
			 pregunta.setTipoPregunta(pojo.obtenerTipoPreguntaXId(pregunta.getTipo_preg_id()));
			 pregunta.setTema(temaPojo.obtener(pregunta.getTemas_id()));
			 pregunta.setOpcionPregunta(pojo.getOpcionesPregunta(pregunta.getId()));
		 }
		 
		 return preguntasEval;
		 
	 }
	 
	 

	 
	 
	 public int obtenerOpcionPreguntaId() {
		 return 0;
	 }
	 

}
