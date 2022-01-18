package mysql;

import frameerror.ErrorFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Vitaminac
 * @version 1.0
 * @since 26/12/2021
 */
public class MysqlConexion {

    //Objeto connection
    public static Connection conexion = null;

    //Driver
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";

    //Server
    private final String SERVER = "localhost";

    //Port
    private final String PORT = "3306";

    //Base de datos
    private final String DATABASE = "inventario";

    //User
    private final String USER = "root";

    //Password
    private final String PASSWORD = "1234";

    //Método para comprobar la conexión con la base de datos
    public void comprobarConexion() throws SQLException, ClassNotFoundException {
        Connection conexion = null;

        Class.forName(DRIVER);
        conexion = DriverManager.getConnection("jdbc:mysql://" + SERVER + ":" + PORT + "/" + DATABASE, USER, PASSWORD);

        if (conexion != null) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        conexion.close();
    }

    //Método para establecer una conexión con la base de datos
    public Connection conexion() {
        Connection conexion = null;
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection("jdbc:mysql://" + SERVER + ":" + PORT + "/" + DATABASE, USER, PASSWORD);

            if (conexion != null) {
                return conexion;
            }
        } catch (SQLException | ClassNotFoundException e) {
            ErrorFrame errorFrame = new ErrorFrame("<html>" + e.toString() + "</html>");
            return null;
        }
        return null;
    }

}
