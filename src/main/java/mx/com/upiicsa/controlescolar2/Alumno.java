/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.upiicsa.controlescolar2;

/**
 *
 * @author eavch
 */
import java.util.ArrayList;
import mx.com.upiicsa.controlescolar2.academia.Curso;
import mx.com.upiicsa.controlescolar2.controlescolar.SituacionAcademica;

public class Alumno {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int boleta;
    private ArrayList<Curso> cursos;
    private SituacionAcademica situacion;

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public SituacionAcademica getSituacion() {
        return situacion;
    }

    public void setSituacion(SituacionAcademica situacion) {
        this.situacion = situacion;
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

    public int getBoleta() {
        return boleta;
    }

    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }
    

    
    
    
}
