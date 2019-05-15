/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * 
 */
public abstract class Curso {
    private String titulo;
    private String fechaInicio;
    private String fechaFin;
    private int diasClases;
    private float precioMatricula;
    private List<Alumno> alumnosMatriculados;
    private List<Alumno> alumnosAptos;
    private int numAlumnosMatriculados;

    public Curso(String titulo, String fechaInicio, String fechaFin, int diasClases, float precioMatricula) {
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.diasClases = diasClases;
        this.precioMatricula = precioMatricula;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }
    
    public int getDiasClases() {
        return diasClases;
    }

    public float getPrecioMatricula() {
        return precioMatricula;
    }

    public List<Alumno> getAlumnosMatriculados() {
        return alumnosMatriculados;
    }

    public List<Alumno> getAlumnosAptos() {
        return alumnosAptos;
    }

    public int getNumAlumnosMatriculados() {
        return numAlumnosMatriculados;
    }
    
    public boolean cursoTerminado(){
        int comparacion;
        Calendar cal=Calendar.getInstance(); 
        String fechaActual=cal.get(cal.DATE)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
        comparacion=fechaActual.compareTo(getFechaFin());
        if(comparacion > 0){
            return false;
        }else{
            return false;
        }
    }
    public abstract boolean alumnoApto(Alumno alumno);
    
    public boolean matricularAlumno(Alumno alumno){
        return alumno.getCredito() > getPrecioMatricula();
    }
    
    public abstract boolean calificar(Alumno alumno);
    
    public void addAlumno(Alumno alumno){
        this.alumnosMatriculados.add(alumno);
    }
}
