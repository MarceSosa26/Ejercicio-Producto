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
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona("Marcela", 37);
        
        System.out.println("Nombre: " + persona.getNombre() );
        System.out.println("Edad: " + persona.getEdad() );
        
        persona.setNombre("Benjamin");
        System.out.println("Nombre: " + persona.getNombre() );
        persona.setEdad(18);
        System.out.println("Edad: " + persona.getEdad());
    }  
}
