package uniquindio.estudiantes.bases;

import java.util.List;
import java.util.Map;

import uniquindio.estudiantes.bases.Controllers.TemasController;
import uniquindio.estudiantes.bases.Controllers.UsuarioController;
import uniquindio.estudiantes.bases.Model.BancoPreguntas;
import uniquindio.estudiantes.bases.Model.Evaluacion;
import uniquindio.estudiantes.bases.Model.Persona;
import uniquindio.estudiantes.bases.Model.Tema;
import uniquindio.estudiantes.bases.Model.TipoPregunta;
import uniquindio.estudiantes.bases.Model.Usuario;
import uniquindio.estudiantes.bases.Pojos.EvaluacionPOJO;
import uniquindio.estudiantes.bases.Pojos.PreguntasPOJO;
import uniquindio.estudiantes.bases.Pojos.TemasPOJO;
import uniquindio.estudiantes.bases.Pojos.UsuarioPOJO;

/**
 *
 * @author uq
 */
public class StartApp{

	private UsuarioController usuarioControl = new UsuarioController();
	
	private TemasController temasController = new TemasController();
	
	

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
////        // TODO code application logic here
////         Runnable runnable = new Runnable() {
////            @Override
////            public void run() {
////                try {
////                    new views.Login().setVisible(true);
////                } catch (InterruptedException | UnsupportedEncodingException ex) {
////                    Logger.getLogger(StartApp.class.getName()).log(Level.SEVERE, null, ex);
////                }
////               
////            }
////        };
////        runnable.run();
//

        
//        PreguntasPOJO p = new PreguntasPOJO();
//        
//        List<TipoPregunta> bp = p.obtenerTiposActivos();
//        
//        for(TipoPregunta b : bp) {
//        	System.out.println(b.getNombre());
//        }
    	
    	UsuarioPOJO p= new UsuarioPOJO();
    	List<Persona> persona = p.getDocentesActivos();
    	
    	for (int i = 0; i < persona.size(); i++) {
			
        	System.out.println("Docente: "+ persona.get(i));
    		
		}
    	
    	
    	EvaluacionPOJO epojo = new EvaluacionPOJO();
    	List<Evaluacion> evaluaciones  = epojo.evaluacionesXEstudiante(4);
    	
    	for(Evaluacion eval : evaluaciones) {
    		System.out.println(" eval = " + eval.imprimir());
    	}

        
    }
    
    public void prueba(String user, String pass) {
    	
    	System.out.println("prueba");
    	Usuario us = usuarioControl.comprobarLogin(user, pass);
    	
    }
    


}
