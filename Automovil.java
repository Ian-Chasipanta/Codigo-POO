public class Automovil {
    // Atributos de la clase
    private String marca;
    private String modelo;
    private String color;
    private int velocidadMaxima;
    private int velocidadActual;

    // Constructor
    public Automovil(String marca, String modelo, String color, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0; // La velocidad inicial es 0
    }

    // Método para acelerar
    public void acelerar(int incremento) {
        velocidadActual += incremento;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
        System.out.println("El automóvil " + marca + " " + modelo + 
                           " acelera a " + velocidadActual + " km/h.");
    }

    // Método para frenar
    public void frenar(int decremento) {
        velocidadActual -= decremento;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
        System.out.println("El automóvil " + marca + " " + modelo + 
                           " reduce la velocidad a " + velocidadActual + " km/h.");
    }

    // Método para mostrar la información del automóvil
    public void mostrarInformacion() {
        System.out.println("Automóvil: " + marca + " " + modelo +
                           ", Color: " + color + 
                           ", Velocidad Máxima: " + velocidadMaxima + " km/h");
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear instancias de Automovil
        Automovil auto1 = new Automovil("Toyota", "Corolla", "Rojo", 180);
        Automovil auto2 = new Automovil("Ford", "Mustang", "Negro", 250);

        // Usar los métodos de la clase
        auto1.mostrarInformacion();
        auto1.acelerar(50);
        auto1.acelerar(150);
        auto1.frenar(80);

        System.out.println(); // Separador

        auto2.mostrarInformacion();
        auto2.acelerar(100);
        auto2.frenar(50);
    }
}
