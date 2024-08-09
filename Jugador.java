import java.util.Random;

public class Jugador {
    private String nombre;
    private int mano;

    // Constructor
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = 0;
    }

    // Métodos
    public void pedir() {
        Random rand = new Random();
        int carta = rand.nextInt(9) + 1; // Genera un número aleatorio entre 1 y 9
        this.mano += carta;
    }

    public void retirarse() {
        // Agregar más adelante
    }

    // Setters Y getters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setMano(int mano) {
        this.mano = mano;
    }

    public int getMano() {
        return this.mano;
    }
}
