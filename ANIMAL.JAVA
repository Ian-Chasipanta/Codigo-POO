package main;

public class Animal {
    public String Especie;
    public String Nombre;

    public Animal(String Especie, String Nombre) {
        this.Especie = Especie;
        this.Nombre = Nombre;
    }
    
   
    
    public void informacion() {
        System.out.println("El Nombre es "+Nombre+"  Y LA ESPECIE ES: "+Especie);
    }
}
