/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre;
    private int edad;
    
    //Costructor
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad >0){
            this.edad = edad;
        }else {
            System.out.println("La edad no puede ser negativa o cero");
        }
    }
    
    
    
}
