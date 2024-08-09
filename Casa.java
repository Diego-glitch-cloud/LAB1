public class Casa {
    private int jugadorVictorias;
    private int dealerVictorias;
    private int empates;
    private int partidas;

    // Constructor Vacío
    public Casa() {
        this.jugadorVictorias = 0;
        this.dealerVictorias = 0;
        this.empates = 0;
        this.partidas = 0;
    }

    // Métodos
    public void iniciar(Jugador jugador, Dealer dealer) {
        jugador.setMano(0);
        dealer.setMano(0);
        
        // Reparte 2 cartas al jugador y 2 cartas al dealer
        for (int i = 0; i < 2; i++) {
            jugador.pedir();
            dealer.pedir();
        }
    }

    // Setters Y Getters

    public void setJugadorVictorias(int jugadorVictorias) {
        this.jugadorVictorias = jugadorVictorias;
    }

    public int getJugadorVictorias() {
        return this.jugadorVictorias;
    }

    public void setDealerVictorias(int dealerVictorias) {
        this.dealerVictorias = dealerVictorias;
    }

    public int getDealerVictorias() {
        return this.dealerVictorias;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }

    public int getPartidas() {
        return this.partidas;
    }

    public String comparar(Jugador jugador, Dealer dealer) {
        int manoJugador = jugador.getMano();
        int manoDealer = dealer.getMano();

        if (manoJugador > 21) {
            return "El jugador perdio.";
        } else if (manoDealer > 21) {
            return "El dealer perdio.";
        } else if (manoJugador > manoDealer) {
            this.jugadorVictorias++;
            return "El jugador gano.";
        } else if (manoDealer > manoJugador) {
            this.dealerVictorias++;
            return "El dealer gano.";
        } else {
            this.empates++;
            return "El juego termino en empate.";
        }
    }
}
