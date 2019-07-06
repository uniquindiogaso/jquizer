/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquindio.estudiantes.bases.Controllers;

import java.util.List;

import uniquindio.estudiantes.bases.Model.Tema;
import uniquindio.estudiantes.bases.Pojos.TemasPOJO;
import uniquindio.estudiantes.bases.Utiles.Res;

/**
 *
 * @author gusta
 */
public class TemasController {
	
    private TemasPOJO pojo;

    public TemasController() {
        this.pojo = new TemasPOJO();
    }

    public Res insertarTema(Tema tema) {
        //Comprobar que ya no exista
        Tema temaExiste = pojo.obtenerByCodigoInterno(tema.getCodInterno());

        if (temaExiste != null) {
            return new Res(-1, "Registro Duplicado", "No se puede crear el Tema .. ya exsite");
        }
        Res res = pojo.insertar(tema);
        return res;
    }

    public Res actualizarTema(Tema tema) {
        Res res = pojo.actualizar(tema);
        return res;
    }

    public List<Tema> obtenerTemas() {
        List<Tema> res = pojo.todosActivos();
        return res;
    }

}
