package framelogin;

import encriptacion_md5.Encriptacion;
import frameerror.ErrorFrame;
import javax.swing.JFrame;
import login.Login;
import usuario.Usuario;

/**
 *
 * @author Vitaminac
 * @version 1.0
 * @since 26/12/2021
 */
public class Funciones_LoginFrame {
    
    Encriptacion encriptacion;

    //Método que comprueba si no están vacíos
    protected void comprobacionDeDatos(JFrame frame, String usuario, String pass) {
        //Clase encargada de encriptar la contraseña recibida
        encriptacion = new Encriptacion();
        
        //Comprobamos si usuario o pass no está vacío
        if (!(usuario.equals("") || pass.equals(""))) {
            //Si no está vacío se crea un objeto usuario y se le setean
            //el usuario y la pass obtenidos en los párametros del método
            Usuario usuarioLogin = new Usuario();
            usuarioLogin.setUsuario(usuario);
            usuarioLogin.setPass(encriptacion.encriptar(pass)); //Falta la encriptación
            
            //Instacia de un objeto login al cual se le pasa el objeto usuario
            Login login = new Login(frame, usuarioLogin);
            
          //Si están vacíos llamos al ErrorFrame y le damos el mensaje de error.
        } else {
            ErrorFrame errorFrame = new ErrorFrame("<html>Debes llenar ambos cambos para poder iniciar sesión.</html>");
        }
    }

}
