/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionesextra1;

/**
 *
 * @author Vane Proaño
 */
public class Main {

    /**
     * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
     */
    public static void main(String[] args) {
        Adoptar a1 = new Adoptar();
        
       a1.crearPersona();
        a1.mostrarPerros();
        a1.adoptarPerro();
        a1.imprimirPerro();
    }
    
}
