package uniquindio.estudiantes.bases.Pojos;

import org.sql2o.Connection;

import uniquindio.estudiantes.bases.Bd.DbHelper;
import uniquindio.estudiantes.bases.Model.Evaluacion;

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

}
