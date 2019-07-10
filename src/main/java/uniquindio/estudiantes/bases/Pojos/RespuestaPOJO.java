package uniquindio.estudiantes.bases.Pojos;

import org.sql2o.Connection;

import uniquindio.estudiantes.bases.Bd.DbHelper;
import uniquindio.estudiantes.bases.Model.Evaluacion;
import uniquindio.estudiantes.bases.Model.ResEstudiante;

public class RespuestaPOJO {
	
//    public int insertar(ResEstudiante e) {
//        int res = -1;
//        final String insertQuery
//                = "INSERT INTO opc_pregunta(evaluacion_id, opc_pregunta_id , pre_eval_id ) VALUES (:evaluacion_id, :opc_pregunta_id , :pre_eval_id ) ";
//
//        try (Connection con = DbHelper.getSql2o().beginTransaction()) {
//            res = (int) con.createQuery(insertQuery, true)
//                    .addParameter("evaluacion_id", e.getEvaluacion_id())
//                    .addParameter("opc_pregunta_id", e.get)
//                    .addParameter("pre_eval_id", "")
//                    .executeUpdate()
//                    .getKey();
//            con.commit();
//        }
//
//        
//        System.out.println("ID de evaluacion en bd " + res);
//        return res;
//    }

}
