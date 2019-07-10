package uniquindio.estudiantes.bases.Pojos;

import java.util.List;
import java.util.Map;

import org.sql2o.Connection;

import uniquindio.estudiantes.bases.Model.BancoPreguntas;
import uniquindio.estudiantes.bases.Model.Evaluacion;
import uniquindio.estudiantes.bases.Model.OpcionPregunta;
import uniquindio.estudiantes.bases.Model.Pregunta;
import uniquindio.estudiantes.bases.Model.ResPreguntasEvaluacion;
import uniquindio.estudiantes.bases.Model.Tema;
import uniquindio.estudiantes.bases.Model.TipoPregunta;
import uniquindio.estudiantes.bases.Model.Usuario;
import uniquindio.estudiantes.bases.Bd.DbHelper;

public class PreguntasPOJO {

    public List<BancoPreguntas> obtenerBanco(Tema tema , Usuario docente){
        try (Connection con = DbHelper.getSql2o().open()) {
            final String query = "SELECT p.id as pregunta_id,  p.codinterno  as codigo  , p.nombre , tp.nombre as \"tipopregunta\" FROM banco_pre as bp , pregunta as p  , tipo_preg as tp\r\n" + 
            		"WHERE bp.pregunta_id = p.id AND p.activo = true AND p.tipo_preg_id = tp.id and ( p.publica = true or bp.propietario_id = :propietario_id ) and bp.temas_id = :tema_id";
            return con.createQuery(query)
            		.addParameter("propietario_id", docente.getId())
            		.addParameter("tema_id", tema.getId())
                    .executeAndFetch(BancoPreguntas.class);
        }
    }
    
    public List<TipoPregunta> obtenerTiposActivos(){
        try (Connection con = DbHelper.getSql2o().open()) {
            final String query = "select id , codinterno , nombre from tipo_preg where activo = true";
            return con.createQuery(query)
                    .executeAndFetch(TipoPregunta.class);
        }
    }
    
    
    public TipoPregunta obtenerTipoPregunta(String codigo) {
        try (Connection con = DbHelper.getSql2o().open()) {
            final String query = "select id , codinterno , nombre from tipo_preg where codinterno = :codinterno LIMIT 1";
            return con.createQuery(query)
            		.addParameter("codinterno", codigo)
                    .executeAndFetchFirst(TipoPregunta.class);
        }
    }
    
    public TipoPregunta obtenerTipoPreguntaXId(int id) {
        try (Connection con = DbHelper.getSql2o().open()) {
            final String query = "select id , codinterno , nombre from tipo_preg where id = :id LIMIT 1";
            return con.createQuery(query)
            		.addParameter("id", id)
                    .executeAndFetchFirst(TipoPregunta.class);
        }
    }
    
    public int insertarPregunta(Pregunta p) {
        int res = -1;
        final String insertQuery
                = "INSERT INTO pregunta(nombre, codinterno, activo, publica, temas_id, tipo_preg_id, tiempo, valor) "
                		+ "VALUES (:nombre, :codinterno, true, :publica, :temas_id, :tipo_preg_id, :tiempo, :valor);";

        try (Connection con = DbHelper.getSql2o().beginTransaction()) {
            res = (int) con.createQuery(insertQuery, true)
                    .addParameter("nombre", p.getNombre())
                    .addParameter("codinterno", p.getCodinterno())
                    .addParameter("publica", p.isActivo())
                    .addParameter("temas_id", p.getTema_id())
                    .addParameter("tipo_preg_id", p.getTipo_preg_id())
                    .addParameter("tiempo", p.getTiempo())
                    .addParameter("valor", p.getValor())

                    .executeUpdate()
                    .getKey();
            con.commit();
        }

        return res;
    }
    
    public int insertarPreguntaXEvaluacion(int preguntaId , int evaluacionId) {
        int res = -1;
        final String insertQuery
                = "INSERT INTO pre_eval(pregunta_id, evaluacion_id)VALUES (:pregunta_id, :evaluacion_id);";

        try (Connection con = DbHelper.getSql2o().beginTransaction()) {
            res = (int) con.createQuery(insertQuery, true)
                    .addParameter("pregunta_id", preguntaId)
                    .addParameter("evaluacion_id", evaluacionId)
                    .executeUpdate()
                    .getKey();
            con.commit();
        }

        return res;    	
    }
    
    public int insertarBancoPreguntas(int preguntaId , int propietarioId , int temaId) {
        int res = -1;
        final String insertQuery
                = "INSERT INTO banco_pre(temas_id, pregunta_id, propietario_id) VALUES (:temaId, :preguntaId, :propietarioId);";

        try (Connection con = DbHelper.getSql2o().beginTransaction()) {
            res = (int) con.createQuery(insertQuery, true)
                    .addParameter("preguntaId", preguntaId)
                    .addParameter("propietarioId", propietarioId)
                    .addParameter("temaId", temaId)
                    .executeUpdate()
                    .getKey();
            con.commit();
        }

        return res;    	
    }

    
    public int insertarOpcionPregunta(OpcionPregunta op) {
        int res = -1;
        final String insertQuery
                = "INSERT INTO opc_pregunta(descripcion, correcta, pista, pregunta_id)VALUES (:descripcion, :correcta, :pista, :pregunta_id);";

        try (Connection con = DbHelper.getSql2o().beginTransaction()) {
            res = (int) con.createQuery(insertQuery, true)
                    .addParameter("descripcion", op.getDescripcion())
                    .addParameter("correcta", op.isCorrecta())
                    .addParameter("pista", op.getPista())
                    .addParameter("pregunta_id", op.getPregunta_id())
                    .executeUpdate()
                    .getKey();
            con.commit();
        }

        return res;    	
    }
    
    public List<ResPreguntasEvaluacion> getPreguntasEvaluacion(int evaluacionId){
        try (Connection con = DbHelper.getSql2o().open()) {
            final String query = "select p.id , p.nombre , p.codinterno , p.publica, p.t_defecto , p.temas_id , p.tipo_preg_id , p.valor , p.tiempo , pxe.id as \"pre_eval_id\"  from pregunta p , pre_eval pxe , evaluacion eval\r\n" + 
            		"where p.activo = true and pxe.pregunta_id = p.id and pxe.evaluacion_id = eval.id and eval.id = :evaluacionId";
            return con.createQuery(query)
            		.addParameter("evaluacionId", evaluacionId)
                    .executeAndFetch(ResPreguntasEvaluacion.class);
        }    	
    }
    
    
    public List<OpcionPregunta> getOpcionesPregunta(int preguntaId){
        try (Connection con = DbHelper.getSql2o().open()) {
            final String query = "select op.id , op.descripcion , op.correcta , op.pista , op.pareja from opc_pregunta op where pregunta_id = :preguntaId";
            return con.createQuery(query)
            		.addParameter("preguntaId", preguntaId)
                    .executeAndFetch(OpcionPregunta.class);
        }    	
    }
    
    

}
