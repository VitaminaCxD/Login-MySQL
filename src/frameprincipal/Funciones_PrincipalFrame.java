package frameprincipal;

import javax.swing.JLabel;
import usuario.Usuario;

/**
 *
 * @author Vitaminac
 * @version 1.0
 * @since 26/12/2021
 * 
 * NO TERMINADO
 */
public class Funciones_PrincipalFrame {
    
    private Usuario usuario;
    
    public Funciones_PrincipalFrame(Usuario usuario) {
        this. usuario = usuario;
    }
    
    protected void colocarInfoUsuario(JLabel[] labels){
        labels[0].setText("USUARIO: " + usuario.getUsuario());
        labels[1].setText("ROL: " + usuario.getRol());
    }
    

}
