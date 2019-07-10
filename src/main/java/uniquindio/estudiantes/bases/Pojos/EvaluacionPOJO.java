package uniquindio.estudiantes.bases.Pojos;

import java.util.List;

import org.sql2o.Connection;

import uniquindio.estudiantes.bases.Bd.DbHelper;
import uniquindio.estudiantes.bases.Model.Evaluacion;
import uniquindio.estudiantes.bases.Model.TipoPregunta;

public class EvaluacionPOJO {
	
    public int insertar(Evaluacion e) {
        int res = -1;
        final String insertQuery
                = "INSERT INTO evaluacion(nombre, descripcion, tipo, f_inicio, f_fin, duracion, activo,docente_id) VALUES (:nombre, :descripcion, :tipo, :f_inicio, :f_fin, :duracion, true ,  :docente_id) RETURNING id;";

        try (Connection con = DbHelper.getSql2o().beginTransaction()) {
            res = (int) con.createQuery(insertQuery, true)
                    .addParameter("nombre", e.getNombre())
                    .addParameter("descripcion", e.getDescripcion())
                    .addParameter("tipo", e.getTipo())
                    .addParameter("f_inicio", e.getF_inicio())
                    .addParameter("f_fin", e.getF_fin())
                    .addParameter("duracion", e.getDuracion())
                    .addParameter("docente_id", e.getDocente_id())
                    .executeUpdate()
                    .getKey();
            con.commit();
        }

        
        System.out.println("ID de evaluacion en bd " + res);
        return res;
    }
    
    
    public List<Evaluacion> evaluacionesXEstudiante(int estudianteId){
        try (Connection con = DbHelper.getSql2o().open()) {
            final String query = "select eval.id, eval.nombre, eval.descripcion, eval.tipo, eval.f_inicio, eval.f_fin, eval.duracion, eval.activo, eval.docente_id, eval.estado\r\n" + 
            		" , CONCAT(p.nombre, ' ', p.apellido) as docente from grup_est ge , grup_docente gd , evaluacion eval , persona p\r\n" + 
            		"where ge.grupo_id = gd.grupo_id AND eval.docente_id = gd.usuario_id AND eval.estado = 'borrador' AND eval.activo = true and eval.f_fin >= now()\r\n" + 
            		"AND p.id = gd.usuario_id AND ge.usuario_id = :estudianteId AND p.tipo = 'Docente'";
            return con.createQuery(query)
            		.addParameter("estudianteId", estudianteId)
                    .executeAndFetch(Evaluacion.class);
        }
    }
    

}
