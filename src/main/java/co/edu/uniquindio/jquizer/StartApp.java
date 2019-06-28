package co.edu.uniquindio.jquizer;

import co.edu.uniquindio.jquizer.controllers.UsuarioController;
import co.edu.uniquindio.jquizer.models.Usuario;

/**
 *
 * @author uq
 */
public class StartApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//         Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    new views.Login().setVisible(true);
//                } catch (InterruptedException | UnsupportedEncodingException ex) {
//                    Logger.getLogger(StartApp.class.getName()).log(Level.SEVERE, null, ex);
//                }
//               
//            }
//        };
//        runnable.run();

        UsuarioController usuarioControl = new UsuarioController();
        Usuario u = usuarioControl.comprobarLogin("sgonzalez", "123");
        
    }

}
