package login;

import frameerror.ErrorFrame;
import framelogin.LoginFrame;
import frameprincipal.PrincipalFrame;
import javax.swing.JFrame;
import mysql.MysqlConsulta;
import usuario.Usuario;

/**
 *
 * @author Vitaminac
 * @version 1.0
 * @since 26/12/2021
 */
public class Login {

    MysqlConsulta mysqlConsulta;

    public Login(JFrame frame, Usuario usuarioLogin) {

        //Generamos la consulta
        mysqlConsulta = new MysqlConsulta();

        //Si devuelve true, es que el usuario y contraseña coinciden
        if (mysqlConsulta.consultaBaseDeDatos(usuarioLogin)) {
            System.out.println("True");
            frame.dispose();
            
            //Ventana principal
            PrincipalFrame principalFrame = new PrincipalFrame(usuarioLogin);

            //Si devuelve false, es que el usuario y contraseña no coinciden
        } else {
            ErrorFrame errorFrame = new ErrorFrame("<html>Usuario o contraseña incorrecto. Inténtelo de nuevo.</html>");
            System.out.println("False");
            LoginFrame.jtf_usuario.setText("");
            LoginFrame.jpf_contra.setText("");
        }
    }

}
