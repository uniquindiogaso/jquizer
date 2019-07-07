package uniquindio.estudiantes.bases.Pojos;

import java.util.List;
import java.util.Map;

import org.sql2o.Connection;

import uniquindio.estudiantes.bases.Model.BancoPreguntas;
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

}
