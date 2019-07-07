/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquindio.estudiantes.bases.Pojos;


import uniquindio.estudiantes.bases.Model.*;
import uniquindio.estudiantes.bases.Bd.DbHelper;

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
    
    
    public Persona getPersona(Usuario u) {
    	System.out.println("Personaid " + u.getId());
        try (Connection con = DbHelper.getSql2o().open()) {
            final String query
                    = "select id , nombre , apellido , correo , telefono , tipo , ciudad_id from persona WHERE id = :persona_id";

            return con.createQuery(query)
                    .addParameter("persona_id", u.getPersona_id())                    
                    .executeAndFetchFirst(Persona.class);
        }	
    	
    }
    
    
    public List<Persona> getDocentesActivos(){
        try (Connection con = DbHelper.getSql2o().open()) {
            final String query
                    = "SELECT u.id , concat(p.nombre,' ' ,p.apellido) FROM usuario u , persona p WHERE u.persona_id = p.id AND tipo = 'Docente' and u.activo = true";

            return con.createQuery(query)
                    .executeAndFetch(Persona.class);
        }
    }
    
}
