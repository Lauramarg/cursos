/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.HashMap;

/**
 *
 * @author HP
 */
public class CursoPresencial extends Curso{

    private final int cupo;
    private final int asistenciasminimas;
    private HashMap<Integer, String> asistencias;
    private int plazaslibres;

    public CursoPresencial(int cupo, int asistenciasminimas, String titulo, String fechaInicio, String fechaFin, int diasClases, float precioMatricula) {
        super(titulo, fechaInicio, fechaFin, diasClases, precioMatricula);
        this.cupo = cupo;
        this.asistenciasminimas = asistenciasminimas;
    }
    
    public HashMap<Integer, String> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(HashMap<Integer, String> asistencias) {
        this.asistencias = asistencias;
    }

    public int getPlazaslibres() {
        return cupo - asistenciasminimas;
    }    
    
    @Override
    public boolean alumnoApto(Alumno alumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean calificar(Alumno alumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
