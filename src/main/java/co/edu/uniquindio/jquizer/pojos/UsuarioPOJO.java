/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniquindio.jquizer.pojos;

import co.edu.uniquindio.jquizer.bd.DbHelper;
import co.edu.uniquindio.jquizer.models.Usuario;
import java.util.List;
import org.sql2o.Connection;

/**
 *
 * @author gusta
 */
public class UsuarioPOJO {

    public List<Usuario> login(String usr, String pass) {
        try (Connection con = DbHelper.getSql2o().open()) {
            final String query
                    = "SELECT id, username, password, persona_id, activo "
                    + "FROM usuario WHERE username = :usr AND password = :pass AND activo = True";

            return con.createQuery(query)
                    .addParameter("usr", usr)
                    .addParameter("pass", pass)
                    .executeAndFetch(Usuario.class);
        }
    }

}
