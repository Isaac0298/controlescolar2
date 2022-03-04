/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.controlescolar2.main;

import mx.com.upiicsa.controlescolar2.Alumno;
import mx.com.upiicsa.controlescolar2.Profesor;
import mx.com.upiicsa.controlescolar2.academia.Curso;
import mx.com.upiicsa.controlescolar2.academia.Materia;
import mx.com.upiicsa.controlescolar2.alumno.Grupo;
import mx.com.upiicsa.controlescolar2.controlescolar.Academia;
import mx.com.upiicsa.controlescolar2.controlescolar.SituacionAcademica;

/**
 *
 * @author Gilberto Garcia
 */
public class Principal {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Erika");
        alumno1.setApellidoPaterno("Venegas");
        alumno1.setApellidoMaterno("Chavez");
        alumno1.setBoleta(2015131474);
        Alumno alumno2 = new Alumno();
        alumno2.setNombre("Isaac");
        alumno2.setApellidoPaterno("Martinez");
        alumno2.setApellidoMaterno("Arias");
        alumno2.setBoleta(2015176978);
        
        Profesor profe1 = new Profesor();
        profe1.setNombre("Jose");
        profe1.setApellidoPaterno("Lopez");
        profe1.setApellidoMaterno("Rabadan");
        profe1.setNumeroEmpleado("001");
        profe1.setRfc("vienowevnivnw");
        Profesor profe2 = new Profesor();
        profe2.setNombre("Jesus");
        profe2.setApellidoPaterno("Lopez");
        profe2.setApellidoMaterno("Haro");
        profe2.setNumeroEmpleado("002");
        profe2.setRfc("keniebvvnoenven");
        
        
        
        Curso curso1 = new Curso();
        
        Materia materia1= new Materia();
        materia1.setNombre("JAva");
        materia1.setCreditos("6");
        Materia materia2= new Materia();
        materia2.setNombre("Redes");
        materia2.setCreditos("8");
        
        
        Grupo grupo1= new Grupo();
        grupo1.setSecuencia("4NV51");
        Grupo grupo2= new Grupo();
        grupo2.setSecuencia("4NV51");
        
        Academia academia1 = new Academia();
        academia1.setNombreAcademia("computacion");
        Academia academia2 = new Academia();
        academia2.setNombreAcademia("matematicas");
        
        
        SituacionAcademica situacionA1= new SituacionAcademica();
        situacionA1.setCarrera("Ingenieria en informatica");
        situacionA1.setSemestre("Sexto");
        situacionA1.setEstatus("TRUE");
        SituacionAcademica situacionA2= new SituacionAcademica();
        situacionA2.setCarrera("Ingenieria en administracion");
        situacionA2.setSemestre("Quinto");
        situacionA2.setEstatus("TRUE");
        
       
        
    }
    
}
