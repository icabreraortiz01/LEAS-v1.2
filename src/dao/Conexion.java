package dao;

//import archivos.Archivos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;

public class Conexion {

    //aqui
    public Connection connectToDB() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://ec2-52-71-107-99.compute-1.amazonaws.com:5432/d3ns1hqd00cgvd","pdnxcvrmtttjyo", "6594d8279274fb4eb52bb5eda8c0947958fc6d565e58e7e3ee3c0da640047451");
            if (connection != null) {
                System.out.println("Se estableció la conexión :)");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error al conectar a la base.");
            e.printStackTrace();
        }finally {
            return connection;
        }

    }


}
