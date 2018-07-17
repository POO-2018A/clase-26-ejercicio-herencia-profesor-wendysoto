/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Wendy Soto
 */
public class Profesor extends Persona {
    
    private String facultad;
    private String materia;
    
    public Profesor(String nombre, String apellido, int edad, String facultad, String materia) {
        super(nombre, apellido, edad);
        this.facultad=facultad;
        this.materia=materia;
        
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return  materia ;
    }
    
}
