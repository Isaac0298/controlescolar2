/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.upiicsa.controlescolar2.controlescolar;

import java.util.ArrayList;
import mx.com.upiicsa.controlescolar2.academia.Materia;

/**
 *
 * @author eavch
 */
public class Academia {
    private String nombreAcademia;
    private ArrayList<Materia> materias;
    
    public Academia(){
    materias = new ArrayList<>();
    }

    public String getNombreAcademia() {
        return nombreAcademia;
    }

    public void setNombreAcademia(String nombreAcademia) {
        this.nombreAcademia = nombreAcademia;
    }
    
    public void addMateria(Materia materia)
    {
        materias.add(materia);
    }
    
    public void printMaterias()
    {
         for(Materia materia: materias)
        {
            System.out.println(materia.getNombre());
            System.out.println(materia.getCreditos());
        }
    }
    
    
}
