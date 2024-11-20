package main;

public class MAIN {
    

    public static void main(String[] args) {
    
        Animal LEON= new Animal("Leonardo","Leon Africano");
        LEON.informacion();
        Animal PINGUINO= new Animal("CUALQUIER COSA","SI");
        PINGUINO.informacion();
        Frutas MANGO= new Frutas("Mango","Amarillo",1.500f);
        MANGO.informacion();
        Frutas SANDIA= new Frutas("Sandia","verde",3.50f);
        SANDIA.informacion();
        Profeciones DOCTOR=new Profeciones ("Doctor",550.20f);
        DOCTOR.informacion();
        Profeciones INGENIERO=new Profeciones ("Ingeniero",1000.20f);
        INGENIERO.informacion();
    }
    
}
