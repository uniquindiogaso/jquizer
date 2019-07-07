package uniquindio.estudiantes.bases;

import java.util.List;
import java.util.Map;

import uniquindio.estudiantes.bases.Controllers.UsuarioController;
import uniquindio.estudiantes.bases.Model.BancoPreguntas;
import uniquindio.estudiantes.bases.Model.Usuario;
import uniquindio.estudiantes.bases.Pojos.PreguntasPOJO;

/**
 *
 * @author uq
 */
public class StartApp{

	private UsuarioController usuarioControl = new UsuarioController();
	
	

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
        UsuarioController usuarioControl = new UsuarioController();
        Usuario u = usuarioControl.comprobarLogin("sgonzalez", "123");
        
        PreguntasPOJO p = new PreguntasPOJO();
        
        List<BancoPreguntas> bp = p.obtenerBanco(null, null);
        
        for(BancoPreguntas b : bp) {
        	System.out.println(b);
        }
        
    }
    
    public void prueba(String user, String pass) {
    	
    	System.out.println("prueba");
    	Usuario us = usuarioControl.comprobarLogin(user, pass);
    	
    }
    


}
