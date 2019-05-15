/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HP
 */
public class CursoOnline extends Curso{

    private final int nivel;
    private HashMap<Alumno,Integer> seguimientoAlumnos = new HashMap<Alumno, Integer>();
    private final List<Curso> cursosPrevios;

    public CursoOnline(String titulo, String fechaInicio, String fechaFin, int diasClases, float precioMatricula, int nivel, List<Curso> cursosPrevios) {
        super(titulo, fechaInicio, fechaFin, diasClases, precioMatricula);
        this.nivel = nivel;
        this.cursosPrevios = cursosPrevios;
    }

    public HashMap<Alumno, Integer> getSeguimientoAlumnos() {
        return seguimientoAlumnos;
    }
    
    public int getnivel(){
        return nivel;
    }
    
    public int consultarNivel(Alumno alumno){
        if(seguimientoAlumnos.containsKey(alumno)){
            return seguimientoAlumnos.get(alumno);
        }else{
            return -1;
        }
    }

    public boolean superarNivel(Alumno alumno){
        int level;
        for (int i = 0; i < getNumAlumnosMatriculados(); i++) {
            if(getAlumnosMatriculados().contains(alumno)){
                if(seguimientoAlumnos.containsKey(alumno)){
                    level = seguimientoAlumnos.get(alumno);
                    if(level < getnivel()){
                        seguimientoAlumnos.put(alumno, level+1);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean matricularAlumno(Alumno alumno){
        boolean sw=true;
        if( alumno.getCredito() > getPrecioMatricula()){
            for (int i = 0; i < cursosPrevios.size(); i++) {
                Curso get = cursosPrevios.get(i);
                if(!get.alumnoApto(alumno)){
                    sw=false;
                    break;
                }
            }
        }
        if(sw){
            addAlumno(alumno);
        }
        return sw;
    }
    
    @Override
    public boolean alumnoApto(Alumno alumno) {
        return this.seguimientoAlumnos.get(this) >= getnivel()/2;
    }

    @Override
    public boolean calificar(Alumno alumno) {
        boolean calificado = false;
        if(cursoTerminado()){
            for (int i = 0; i < getAlumnosMatriculados().size(); i++) {
                if(alumnoApto(alumno)){
                    
                }
            }
            
        }
        return calificado;
    }
    
    
     
    
}
