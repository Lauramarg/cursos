/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.List;

public class Alumno {
    private final String alumno;
    private final String DNI;
    private float credito;
    private List<Curso> cursosMatriculados;

    public Alumno(String alumno, String DNI, List<Curso> cursos) {
        this.alumno = alumno;
        this.DNI = DNI;
        this.credito=100;
        this.cursosMatriculados = cursos;
    }
    public Alumno(String alumno, String DNI, float credito, List<Curso> cursos) {
        this.alumno = alumno;
        this.DNI = DNI;
        this.credito = credito;
        this.cursosMatriculados = cursos;
    }

    public float getCredito() {
        return credito;
    }
    public List<Curso> getCursos() {
        return cursosMatriculados;
    }
    public void incrementarCredito(float credito){
        this.credito +=credito;
    }
    public void decrementarCredito(float credito){
        if(this.credito >= credito){
            this.credito -= credito;
        }else{
            System.out.println("No se puede decrementar el credito, excede al que pertenece al alumno");
        }
    }
    public void addCurso(Curso curso){
        this.cursosMatriculados.add(curso);
    }

    @Override
    public String toString() {
        return "Alumno{" + "alumno=" + alumno + ", DNI=" + DNI + ", credito=" + credito + ", cursosMatriculados=" + cursosMatriculados + '}';
    }

    

    
    
    
}
