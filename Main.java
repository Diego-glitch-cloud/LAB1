import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear Instancias
        Dealer dealer = new Dealer();
        Casa casa = new Casa();

        // Solicito el nombre del jugador al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = scanner.nextLine();

        // Instancio la clase de jugador con el nombre
        Jugador jugador = new Jugador(nombre);

        boolean continuar = true;
        String resultado;

        // Se inicia el juego
        casa.iniciar(jugador, dealer);
        while (continuar) {
            boolean fin = false;

            System.out.println("Mano del jugador: " + jugador.getMano());
            int manoDealer = dealer.getMano() - dealer.getPrimeraCarta();
            System.out.println("Mano visible del dealer: " + manoDealer); // No se muestra la primera carta

            System.out.println("¿Desea pedir una carta (pedir) o retirarse (retirarse)?");
            String opcion = scanner.nextLine();

            if (opcion.equals("pedir")) {
                jugador.pedir();
                dealer.pedir();

                // Revisar si pierde el jugador
                if (jugador.getMano() > 21) {
                    resultado = casa.comparar(jugador, dealer);
                    System.out.println(resultado);
                    System.out.println("Mano final del jugador: " + jugador.getMano());
                    System.out.println("Mano final del dealer: " + dealer.getMano());
                    fin = true;
                }

            } else if (opcion.equals("retirarse")) {
                resultado = casa.comparar(jugador, dealer);
                System.out.println(resultado);
                System.out.println("Mano final del jugador: " + jugador.getMano());
                System.out.println("Mano final del dealer: " + dealer.getMano());
                fin = true;
            } else {
                System.out.println("opción no válida. Intente de nuevo.");
            }

            if (fin) {
                System.out.println("¿Desea continuar jugando? (s) o (n)");
                String respuesta = scanner.nextLine();

                if (respuesta.equalsIgnoreCase("n")) {
                    continuar = false;
                    System.out.println("Saliendo...");
                } else if (respuesta.equalsIgnoreCase("s")) {
                    // Se inicia el juego
                    casa.iniciar(jugador, dealer);
                } else {
                    System.out.println("opción no válida. Intente de nuevo.");
                }
            }

        }

        // Mostrar estadísticas
        System.out.println("Victorias del jugador: " + casa.getJugadorVictorias());
        System.out.println("Victorias del dealer: " + casa.getDealerVictorias());
        System.out.println("Empates: " + casa.getEmpates());
        System.out.println("Partidas jugadas: " + casa.getPartidas());

        scanner.close();
    }

} // prueba keys