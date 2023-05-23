/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1.main;

import ejercicio1.Perro;
import ejercicio1.Persona;

/**
 *
 * @author Vane Proaño
 */
public class Main {

    /**
     Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
     */
    public static void main(String[] args) {

        Perro perro1 = new Perro("yeiko", "pitbull", 7, 0.5);
        Perro perro2 = new Perro("Palomo","Pastor", 3 , 0.7);        
        Persona per1 = new Persona("Jhojan", "López", 20, 123, perro1);
        Persona per2 = new Persona("Vanessa", "Proaño", 18, 123, perro2);
        
        System.out.println("Las personas con sus datos y perros son: ");
        System.out.println("");
        System.out.println(per1);
        System.out.println(" ");
        System.out.println(per2);
    }
    
}
