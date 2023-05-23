/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesextra1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Vane Proaño
 */
public class Adoptar {

    ArrayList<Persona> persona = new ArrayList();
    Perro p1;
    String perro2;

    Scanner leer = new Scanner(System.in);

    public void crearPersona() {

        do {
            Scanner leer = new Scanner(System.in);
            System.out.print("Ingrese su nombre: ");
            String nombre = leer.nextLine();
            System.out.print("Ingrese su apellido: ");
            String apellido = leer.nextLine();
            System.out.print("Ingrese su edad: ");
            int edad = leer.nextInt();
            System.out.print("Ingrese su ID: ");
            int id = leer.nextInt();
            System.out.println("Desea agregar otra persona? \nS/N");
            leer.nextLine();

            Persona Persona = new Persona(nombre, apellido, edad, id);
            persona.add(Persona);
        } while (leer.next().equalsIgnoreCase("s"));

    }

    public void mostrarPerros() {
        System.out.println("Estos son los perros disponibles:");

        System.out.printf("%-18s %-15s %-15s %-10s%n", "Raza", "Edad", "Nombre", "Tamaño");
        System.out.println("---------------------------------------------------------");

        for (Perro perro : Perro.values()) {

            System.out.printf("%-18s %-15s %-20s %-10s%n", perro.getRaza(), perro.getEdad(), perro.getNombre(), perro.getTamano());
        }
    }

    public void adoptarPerro() {

        for (Persona persona1 : persona) {
            System.out.println("");
            System.out.println(persona1.getNombre());
            System.out.println("Que perro desea adoptar? Ingrese su nombre");
            String perro2 = leer.next();

            boolean encontrado = false;

            while   (!encontrado){
                for (Perro perro : Perro.values()) {

                if (perro.getNombre().equalsIgnoreCase(perro2)) {
                    if (perro.adoptado()) {
                          System.out.println("el perro esta adoptado. por favor adopte otro perro disponible");
                          System.out.println("Que perro desea adoptar? Ingrese su nombre");
                          perro2 = leer.next();
                     
                    } else {
                        System.out.println("perro adoptado");
                        persona1.setPerro(perro);
                        perro.setadoptado(true);
                         encontrado = true;
                         break;
                                     
                       
                     }
                     
                }

            }
            if (!encontrado) {
                System.out.println("No se encontró el perro solicitado");
                System.out.println("Que perro desea adoptar? Ingrese su nombre");
                perro2 = leer.next();

            }
        }

            }
                
            }
            
    

    public void imprimirPerro() {
        for (Persona persona1 : persona) {
            System.out.println(persona1);
        }
    }
}
