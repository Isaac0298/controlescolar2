/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.upiicsa.controlescolar2;

import java.util.ArrayList;
import mx.com.upiicsa.controlescolar2.academia.Curso;

/**
 *
 * @author eavch
 */
public class Profesor {
    private String rfc;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String numeroEmpleado;
    private ArrayList<Curso> cursos;
    
    public Profesor()
    {
        cursos = new ArrayList<>();
    }
    //curso//

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    
    public void addCurso(Curso curso){
        cursos.add(curso);
    }
    public void printCurso(){  
        for(var curso:cursos){
                System.out.println(curso.getHorario());
                System.out.println(curso.getMateria());
                System.out.println(curso.getProfesor());
                curso.printAlumnos();
                
            }
        }
}
