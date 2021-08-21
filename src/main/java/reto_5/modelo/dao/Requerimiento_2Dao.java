package reto_5.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import reto_5.modelo.vo.Requerimiento_2;
import reto_5.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        // Su código
            ArrayList<Requerimiento_2> answer = new ArrayList<>();
            Connection connection = JDBCUtilities.getConnection();
            Statement statement = null;
            ResultSet results = null;
            
            try {
                statement = connection.createStatement();
                String query = "select LOWER(SUBSTR(Nombre,1,1)) || UPPER(SUBSTR(Nombre,2,LENGTH(Nombre))) 'nombre'\n" +
                                "from Lider;";
                results = statement.executeQuery(query);
                while (results.next()) {
                    Requerimiento_2 vo = new Requerimiento_2();
                    vo.setNombre(results.getString("nombre"));
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