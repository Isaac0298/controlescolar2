/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.upiicsa.controlescolar2.academia;

import java.util.ArrayList;
import mx.com.upiicsa.controlescolar2.Alumno;
import mx.com.upiicsa.controlescolar2.Profesor;

/**
 *
 * @author eavch
 */
public class Curso {
    private Materia materia;
    private String horario;
    private Profesor profesores;
    private ArrayList<Alumno> alumnos;
    
    public Curso(){
        alumnos=new ArrayList<>();
    }
    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Profesor getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor profesores) {
        this.profesores = profesores;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

   
    
}
