package uniquindio.estudiantes.bases.Bd;

import org.sql2o.Sql2o;

/**
 *
 * @author uq
 */
public class DbHelper {

    //private static Sql2o sql2o = new Sql2o("jdbc:postgresql://ceam-csp.me/jquizerdb", "jquizerdb_admin", "123456");
    private static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost/jquizerdb", "jquizerdb_admin", "123456");

    public static Sql2o getSql2o() {
        return sql2o;
    }

}
