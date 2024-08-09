import java.util.Random;

public class Dealer {
    private int mano;
    private int primeraCarta;

    // Constructor Vacío
    public Dealer() {
        this.mano = 0;
        this.primeraCarta = 0;
    }

    // Métodos
    public void pedir() {
        Random rand = new Random();
        int carta = rand.nextInt(9) + 1; // Genera un número aleatorio entre 1 y 9
        if (this.mano == 0 && this.primeraCarta == 0) {
            this.primeraCarta = carta;
        } else {
            this.mano += carta;
        }
    }

    public void setMano(int mano) {
        this.mano = mano;
    }

    public int getPrimeraCarta() {
        return this.primeraCarta;
    }

    public void setPrimeraCarta(int primeraCarta) {
        this.primeraCarta = primeraCarta;
    }

    public int getMano() {
        return this.mano + this.primeraCarta;
    }
}
