package reto_5.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import reto_5.modelo.vo.Requerimiento_1;
import reto_5.util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        // Su código
        ArrayList<Requerimiento_1> answer = new ArrayList<>();
            Connection connection = JDBCUtilities.getConnection();
            Statement statement = null;
            ResultSet results = null;
            
            try {
                statement = connection.createStatement();
                String query = "select nombre,primer_apellido,segundo_apellido,salario\n" +
                                    "from lider\n" +
                                    "where segundo_apellido = \"Ortiz\"";
                results = statement.executeQuery(query);
                while (results.next()) {
                    Requerimiento_1 vo = new Requerimiento_1();
                    vo.setNombre(results.getString("nombre"));
                    vo.setPrimerApellido(results.getString("primer_apellido"));
                    vo.setSegundoApellido(results.getString("segundo_apellido"));
                    vo.setSalario(results.getString("salario"));
                    answer.add(vo);
                }
            } catch (SQLException ex) {
                /* Ignored */ 
            } finally {
                try { results.close(); } catch (Exception e) { /* Ignored */ }
                try { statement.close(); } catch (Exception e) { /* Ignored */ }
                try { connection.close(); } catch (Exception e) { /* Ignored */ }
            }
            return answer;
    }
}