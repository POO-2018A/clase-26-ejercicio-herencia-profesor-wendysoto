/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;

/**
 *
 * @author Wendy Soto
 */
public class Estudiante extends Persona{
    
     private ArrayList<Materia> materias;
     
    public Estudiante(String nombre, String apellido, int edad){
        
        super(nombre,apellido,edad);
        
         this.materias= new ArrayList<>();
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

public String toString() {
        return nombre + " " + apellido;
    }    
    
    
    
}
