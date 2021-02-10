package dao;

import modelo.Pregunta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PreguntaDao extends Conexion {

    public ArrayList<Pregunta> listar() {
        ArrayList<Pregunta> preguntas = new ArrayList();

        try (Connection connection = connectToDB()) {
            String query = "SELECT * FROM preguntas"; //sentencia
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

           /* while (rs.next()) {
                Pregunta user = new Pregunta(
                        Integer.valueOf(rs.getString("id")),
                        rs.getString("nombre"),
                        rs.getString("apellido")
                );
                preguntas.add(user);
            }*/
        } catch (SQLException e) {
            System.out.println("" + e.getMessage());
            // TODO: handle exception
        }

        return preguntas;
    }
    //Guardar una nueva pregunta
    public void insertarPregunta(Pregunta pregunta) {
        try (Connection connection = connectToDB()) {
            PreparedStatement ps = null;
            //Statement statement = connection.createStatement();
            String query = "insert into preguntas (descripcion, optionbluetxt, optionredtxt, optionyellowtxt, optiongreentxt, " +
                    "optionblueurl, optionredurl, optionyellowurl, optiongreenurl, " +
                    "optionblue, optionred, optionyellow, optiongreen, " +
                    "cuestionario_id, numPregunta) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = connection.prepareStatement(query);
            ps.setString(1, pregunta.getDescripcion());
            ps.setString(2, pregunta.getOptionBlueTxt());
            ps.setString(3, pregunta.getOptionRedTxt());
            ps.setString(4, pregunta.getOptionYellowTxt());
            ps.setString(5, pregunta.getOptionGreenTxt());
            ps.setString(6, pregunta.getOptionBlueUrl());
            ps.setString(7, pregunta.getOptionRedUrl());
            ps.setString(8, pregunta.getOptionYellowUrl());
            ps.setString(9, pregunta.getOptionGreenUrl());
            ps.setBoolean(10, pregunta.getOptionBlue());
            ps.setBoolean(11, pregunta.getOptionRed());
            ps.setBoolean(12, pregunta.getOptionYellow());
            ps.setBoolean(13, pregunta.getOptionGreen());
            ps.setInt(14, pregunta.getCuestionario_id());
            ps.setInt(15,pregunta.getNumPregunta());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al guardar"+e.getMessage());
            //e.printStackTrace();
        }
    }

    //Actualizar Pregunta
    public void actualizarPregunta(Pregunta pregunta) {
        try (Connection connection = connectToDB()) {
            PreparedStatement ps = null;
            //Statement statement = connection.createStatement();
            String query = "update preguntas set descripcion = ?, optionBlueTxt = ?, optionRedTxt = ?," +
                    "optionYellowTxt=? , optionGreenTxt=?, optionBlueUrl=?, optionRedUrl=?, optionYellowUrl=?," +
                    "optionGreenUrl=?, optionBlue=?, optionRed=?, optionYellow=?, optionGreen=?,cuestionario_id=?," +
                    " numPregunta=? where id =?"; //ojo no olvidarsse del where
            ps = connection.prepareStatement(query);
            ps.setString(1, pregunta.getDescripcion());
            ps.setString(2, pregunta.getOptionBlueTxt());
            ps.setString(3, pregunta.getOptionRedTxt());
            ps.setString(4, pregunta.getOptionYellowTxt());
            ps.setString(5, pregunta.getOptionGreenTxt());
            ps.setString(6, pregunta.getOptionBlueUrl());
            ps.setString(7, pregunta.getOptionRedUrl());
            ps.setString(8, pregunta.getOptionYellowUrl());
            ps.setString(9, pregunta.getOptionGreenUrl());
            ps.setBoolean(10, pregunta.getOptionBlue());
            ps.setBoolean(11, pregunta.getOptionRed());
            ps.setBoolean(12, pregunta.getOptionYellow());
            ps.setBoolean(13, pregunta.getOptionGreen());
            ps.setInt(14, pregunta.getCuestionario_id());
            ps.setInt(15, pregunta.getNumPregunta());
            ps.setInt(16, pregunta.getId());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error:"+e.getMessage() );
            //estos errores guardar ennun archivo
        }
    }
    //Eliminar  un usuario
    public void eliminarUsuario(int id) {
        try (Connection connection = connectToDB()) {
            PreparedStatement ps = null;
            //Statement statement = connection.createStatement();
            String query = "delete from usuario where id =? ";///ojo con el where
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Pregunta findOne(int cuestionarioId, int numPregunta) {
        Pregunta preguntas = null;

        try (Connection connection = connectToDB()) {
            PreparedStatement ps = null;
            String query = "SELECT * FROM preguntas where cuestionario_id=? and numPregunta=?"; //sentencia
            ps = connection.prepareStatement(query);
            ps.setInt(1, cuestionarioId);
            ps.setInt(2, numPregunta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pregunta p = new Pregunta(
                        Integer.parseInt(rs.getString("Id")),
                        rs.getString("descripcion"),
                        rs.getString("optionBlueTxt"),
                        rs.getString("optionRedTxt"),
                        rs.getString("optionYellowTxt"),
                        rs.getString("optionGreenTxt"),
                        rs.getString("optionBlueUrl"),
                        rs.getString("optionRedUrl"),
                        rs.getString("optionYellowUrl"),
                        rs.getString("optionGreenUrl"),
                        rs.getBoolean("optionBlue"),
                        rs.getBoolean("optionRed"),
                        rs.getBoolean("optionYellow"),
                        rs.getBoolean("optionGreen"),
                        rs.getInt("cuestionario_id"),
                        rs.getInt("numPregunta")


                );

                preguntas=p;


            }

        } catch (SQLException e) {
            System.out.println("" + e.getMessage());
            // TODO: handle exception
        }

        return preguntas;
    }

}
