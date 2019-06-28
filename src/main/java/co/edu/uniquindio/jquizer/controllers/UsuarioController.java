package co.edu.uniquindio.jquizer.controllers;

import co.edu.uniquindio.jquizer.models.Usuario;
import co.edu.uniquindio.jquizer.pojos.UsuarioPOJO;
import java.util.List;

/**
 *
 * @author gusta
 */
public class UsuarioController {

    private UsuarioPOJO pojo;

    public UsuarioController() {
        pojo = new UsuarioPOJO();
    }

    public Usuario comprobarLogin(String usuario, String clave) {
        List<Usuario> usuarios = pojo.login(usuario, clave);

        if (usuarios.isEmpty()) {
            //No Existe ningun usuario con esos datos
            return null;
        }

        if (usuarios.size() == 1) {
            //TODO Consultar Persona y seatearlo para enviarlo
            return usuarios.get(0);           
        }
        //error general
        return null;
    }

}
