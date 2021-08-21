package reto_5.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import reto_5.modelo.vo.Requerimiento_3;
import reto_5.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        // Su código
            ArrayList<Requerimiento_3> answer = new ArrayList<>();
            Connection connection = JDBCUtilities.getConnection();
            Statement statement = null;
            ResultSet results = null;
            
            try {
                statement = connection.createStatement();
                String query = "select Cargo, avg(Salario) 'avgSalario'\n" +
                            "from Lider \n" +
                            "group by Cargo \n" +
                            "HAVING avg(Salario) > 500000";
                results = statement.executeQuery(query);
                while (results.next()) {
                    Requerimiento_3 vo = new Requerimiento_3();
                    vo.setCargo(results.getString("Cargo"));
                    vo.setAvgSalario(results.getString("avgsalario"));
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