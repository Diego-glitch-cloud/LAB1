import java.util.Random;

public class Dealer {
    private int mano;

    // Constructor Vacío
    public Dealer() {
        this.mano = 0;
    }

    // Métodos
    public int pedir() {
        Random rand = new Random();
        int carta = rand.nextInt(9) + 1; // Genera un número aleatorio entre 1 y 9
        this.mano += carta;
        return carta;
    }

    public void setMano(int mano) {
        this.mano = mano;
    }

    public int getMano() {
        return this.mano;
    }
}
