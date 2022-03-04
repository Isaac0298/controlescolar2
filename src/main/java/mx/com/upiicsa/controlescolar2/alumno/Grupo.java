/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.upiicsa.controlescolar2.alumno;

import java.util.ArrayList;
import mx.com.upiicsa.controlescolar2.academia.Materia;

/**
 *
 * @author eavch
 */
public class Grupo {
    private String secuencia;
    private ArrayList<Materia> materia;
    
    public Grupo(){
    materia = new ArrayList<>();
}

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }

    public ArrayList<Materia> getMateria() {
        return materia;
    }

    public void setMateria(ArrayList<Materia> materia) {
        this.materia = materia;
    }
}
