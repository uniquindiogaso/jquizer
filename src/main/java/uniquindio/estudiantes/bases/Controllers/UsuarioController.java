package uniquindio.estudiantes.bases.Controllers;


import java.util.List;

import uniquindio.estudiantes.bases.Model.Persona;
import uniquindio.estudiantes.bases.Model.Usuario;
import uniquindio.estudiantes.bases.Pojos.UsuarioPOJO;

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
    	//System.out.println("controller");
        List<Usuario> usuarios = pojo.login(usuario, clave);

        if (usuarios.isEmpty()) {
            //No Existe ningun usuario con esos datos
        	//System.out.println("no hay nadie");
            return null;
		}

        if (usuarios.size() == 1) {
            //TODO Consultar Persona y seatearlo para enviarlo
        	//System.out.println("entro");
            return usuarios.get(0);           
        }
        //error general
        return null;
    }
    
    
    public Persona getPersona ( Usuario u) {
    		return pojo.getPersona(u);
    }

}
