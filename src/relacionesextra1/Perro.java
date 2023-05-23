/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package relacionesextra1;

/**
 *
 * @author Vane Proaño
 */
public enum Perro {
    
    GOLDEN("Golden", 8, "Luna", "Mediano"),
    HUSKY("Husky", 1, "Kira", "Grande"),
    SALCHICHA("Salchicha", 3, "Mancha", "Pequeño"),
    BEAGLE("Beagle", 6, "Copo", "Pequeño"),
    FRENCH("French", 1, "Scooby", "Grande"),
    BOXER("Boxer", 4, "Lady", "Pequeño");
    
    private String raza;
    private int edad;
    private String nombre;
    private String tamano;
    private boolean adoptado;

    private Perro(String nombre) {
       
        this.nombre = nombre;
        this.adoptado=false;

    }
 
    private Perro(String raza, int edad, String nombre, String tamano) {
        this.raza = raza;
        this.edad = edad;
        this.nombre = nombre;
        this.tamano = tamano;
    }
    
    public String getadoptado(){
        return nombre;
    }
    
    public boolean adoptado(){
        return adoptado;
    }
    
    public void setadoptado(boolean adoptado){
        this.adoptado = adoptado;
    }
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nraza=").append(raza);
        sb.append("\nedad=").append(edad);
        sb.append("\nnombre=").append(nombre);
        sb.append("\ntamano=").append(tamano);
        
        return sb.toString();
    }
    
    
}
