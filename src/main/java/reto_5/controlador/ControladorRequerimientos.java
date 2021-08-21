package reto_5.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import reto_5.modelo.dao.Requerimiento_1Dao;
import reto_5.modelo.dao.Requerimiento_2Dao;
import reto_5.modelo.dao.Requerimiento_3Dao;
import reto_5.modelo.vo.Requerimiento_1;
import reto_5.modelo.vo.Requerimiento_2;
import reto_5.modelo.vo.Requerimiento_3;

public class ControladorRequerimientos {
    // Su código
    
    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
            // Su código
            Requerimiento_1Dao rq1 = new Requerimiento_1Dao();
            ArrayList<Requerimiento_1> rq1Results = rq1.requerimiento1();
            return rq1Results;
        }
    
        public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
            // Su código
            Requerimiento_2Dao rq2 = new Requerimiento_2Dao();
            ArrayList<Requerimiento_2> rq2Results = rq2.requerimiento2();
            return rq2Results;
        }
    
        public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
            // Su código
            Requerimiento_3Dao rq3 = new Requerimiento_3Dao();
            ArrayList<Requerimiento_3> rq3Results = rq3.requerimiento3();
            return rq3Results;
        }
}
