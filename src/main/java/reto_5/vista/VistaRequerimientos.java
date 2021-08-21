package reto_5.vista;

import java.util.ArrayList;

import reto_5.controlador.ControladorRequerimientos;

import reto_5.modelo.vo.Requerimiento_1;
import reto_5.modelo.vo.Requerimiento_2;
import reto_5.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static String requerimiento1(){
        String resultado = "Requerimiento 1";
        String row = "";
        try {
            // Su código
            ArrayList<Requerimiento_1> rq1Results = controlador.consultarRequerimiento1();
            for (Requerimiento_1 rq1Result: rq1Results) {
                row = String.format("%s %s %s %s %n", rq1Result.getNombre(), rq1Result.getPrimerApellido(), rq1Result.getSegundoApellido(), rq1Result.getSalario());
                resultado = resultado + "\n" + row;
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return resultado;
    }

    public static String requerimiento2(){
        String resultado = "Requerimiento 2";
        String row = "";
        try {
            // Su código
            ArrayList<Requerimiento_2> rq2Results = controlador.consultarRequerimiento2();
            for (Requerimiento_2 rq2Result: rq2Results) {
                row = String.format("%s %n", rq2Result.getNombre());
                resultado = resultado + "\n" + row;
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return resultado;
    }

    public static String requerimiento3(){
        String resultado = "Requerimiento 3";
        String row = "";
        try {
            // Su código
            ArrayList<Requerimiento_3> rq3Results = controlador.consultarRequerimiento3();
            for (Requerimiento_3 rq3Result: rq3Results) {
                row = String.format("%s %s %n", rq3Result.getCargo(), rq3Result.getAvgSalario());
                resultado = resultado + "\n" + row;
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return resultado;
    }
    
}
