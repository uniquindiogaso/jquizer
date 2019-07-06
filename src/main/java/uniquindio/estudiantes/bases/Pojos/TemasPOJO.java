package uniquindio.estudiantes.bases.Pojos;

import uniquindio.estudiantes.bases.Bd.DbHelper;
import uniquindio.estudiantes.bases.Model.Tema;
import uniquindio.estudiantes.bases.Utiles.Res;

import java.util.List;

import org.sql2o.Connection;



public class TemasPOJO {

    public List<Tema> todos() {
        try (Connection con = DbHelper.getSql2o().open()) {
            final String query
                    = "SELECT id, codinterno, descripcion, activo, nombre FROM temas";
            return con.createQuery(query)
                    .executeAndFetch(Tema.class);
        }
    }

    public List<Tema> todosInactivos() {
        try (Connection con = DbHelper.getSql2o().open()) {
            final String query
                    = "SELECT id, codinterno, descripcion, activo, nombre FROM temas WHERE activo = False";
            return con.createQuery(query)
                    .executeAndFetch(Tema.class);
        }
    }

    public List<Tema> todosActivos() {
        try (Connection con = DbHelper.getSql2o().open()) {
            final String query
                    = "SELECT id, codinterno, descripcion, activo, nombre FROM temas WHERE activo = True";
            return con.createQuery(query)
                    .executeAndFetch(Tema.class);
        }
    }

    public Tema obtener(int temaId) {
        try (Connection con = DbHelper.getSql2o().open()) {
            final String query
                    = "SELECT id, codinterno, descripcion, activo, nombre "
                    + "FROM temas WHERE id = :id LIMIT 1";

            return con.createQuery(query)
                    .addParameter("id", temaId)
                    .executeAndFetchFirst(Tema.class);
        }
    }

    public Tema obtenerByCodigoInterno(String codInterno) {
        try (Connection con = DbHelper.getSql2o().open()) {
            final String query
                    = "SELECT id, codinterno, descripcion, activo, nombre "
                    + "FROM temas WHERE codinterno = :codinterno LIMIT 1";

            return con.createQuery(query)
                    .addParameter("codinterno", codInterno)
                    .executeAndFetchFirst(Tema.class);
        }
    }

    public Res insertar(Tema tema) {
        int res = -1;
        final String insertQuery
                = "INSERT INTO temas (codinterno, descripcion, activo, nombre) "
                + "VALUES (:codinterno, :descripcion, :activo , :nombre)";

        try (Connection con = DbHelper.getSql2o().beginTransaction()) {
            res = con.createQuery(insertQuery, true)
                    .addParameter("codinterno", tema.getCodInterno())
                    .addParameter("nombre", tema.getNombre())
                    .addParameter("descripcion", tema.getDescripcion())
                    .addParameter("activo", true)
                    .executeUpdate()
                    .getResult();
            con.commit();
        }

        if (res != -1) {
            return new Res(res, "Inserción Exitosa", "Se ha registrado el tema correctamente");
        }
        return new Res(res, "Error Insertando", "No se logro insertar el tema.");
    }

    public Res actualizar(Tema tema) {
        int res = -1;

        final String updateQuery
                = "UPDATE temas SET codinterno = :codinterno, descripcion= :descripcion, activo = :activo , nombre = :nombre WHERE id = :id";

        try (Connection con = DbHelper.getSql2o().open()) {
            res = con.createQuery(updateQuery, true)
                    .addParameter("id", tema.getId())
                    .addParameter("codinterno", tema.getCodInterno())
                    .addParameter("nombre", tema.getNombre())
                    .addParameter("descripcion", tema.getDescripcion())
                    .addParameter("activo", tema.isActivo())
                    .executeUpdate()
                    .getResult();
        }

        if (res != -1) {
            return new Res(res, "Actualizacion Exitosa", "Se ha actualizado la informacion del tema correctamente");
        }
        return new Res(res, "Error Actualizado", "No se logro actualizar el tema.");
    }

}
