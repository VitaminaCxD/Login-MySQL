package mysql;

import frameerror.ErrorFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import usuario.Usuario;

/**
 *
 * @author Vitaminac
 * @version 1.0
 * @since 26/12/2021
 */
public class MysqlConsulta {

    //Objeto connection
    private Connection conexion;

    //MysqlConexion
    MysqlConexion mysqlConexion;

    //Base de datos
    private final String DATABASE = "inventario";

    //Tabla de datos
    private final String TABLE = ".usuarios";

    //Método para hacer consulta de login a la base de datos
    public boolean consultaBaseDeDatos(Usuario usuarioLogin) {
        //Se establece la conexión a la base de datos
        mysqlConexion = new MysqlConexion();
        conexion = mysqlConexion.conexion();
        
        //PreparedStatement y su Query
        PreparedStatement pst;
        String Query = "SELECT id, usuario, pass, rol FROM " + DATABASE + TABLE + " WHERE usuario = ?";

        try {   
            //Hacemos la llamada a la base de datos
            pst = conexion.prepareStatement(Query);
            //Le pasamos el nombre obtenido del objeto Usuario
            pst.setString(1, usuarioLogin.getUsuario());
            //Guardamos lo obtenido en resultset
            ResultSet rs = pst.executeQuery();

            //Si encuentra algo entra al if
            if (rs.next()) {
                //Si coincide guarda la id encontrada y retorna true
                if(usuarioLogin.getPass().equalsIgnoreCase(rs.getString(3))){
                    usuarioLogin.setId(rs.getInt(1));
                    usuarioLogin.setRol(rs.getString(4));
                    return true;
                } else {
                    //Si no coincide retorna false
                    return false;
                }
            }
          //Si sucede un error retorna false  
        } catch (SQLException e) {
            System.out.println(e);
            ErrorFrame errorFrame = new ErrorFrame("<html>" + e.toString() + "</html>");
            return false;
        }
        return false;
    }

}
