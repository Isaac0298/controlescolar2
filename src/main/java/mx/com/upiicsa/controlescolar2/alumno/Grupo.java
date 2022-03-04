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
    private ArrayList<Materia> materias;
    
    public Grupo(){
    materias = new ArrayList<>();
}

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }

        public void addMateria(Materia materia)
    {
        materias.add(materia);
    }
    
    public void printList()
    {
        for(Materia materia: materias)
        {
            System.out.println(materia.getNombre());
            System.out.println(materia.getCreditos());
        }
    }

}
