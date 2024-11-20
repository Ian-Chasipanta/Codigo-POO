package main;
public class Profeciones {
    
    public String Nombre;
    public float Salario;
    
    public Profeciones(String Nombre, float Salario){
        this.Nombre=Nombre;
        this.Salario=Salario;
    }
    
    public void informacion() {
        System.out.println("El nombre es " + Nombre + " y su salario es " + Salario + "$ al mes.");
    }
    
}
