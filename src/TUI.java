import java.util.Scanner;

public class TUI{
    static Scanner sc = new Scanner(System.in);

    public void gameMenu() {
        System.out.println("Benvingut al joc!");
        System.out.println("1. Nova partida");
        System.out.println("2. Carregar partida");
        System.out.println("3. Configuració");
        System.out.println("4. Sortir");
    }

    public void newGame() {}

    public void saveGame() {}

    public void configure() {}

    public void exitGame() {}

    public void errorGame() {}

    public void mostrarMenu() {
        while (true) {
            gameMenu();
            System.out.print("Selecciona una opció: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Has seleccionat Nova partida.");;
                    break;
                case 2:
                    System.out.println("Has seleccionat Carregar partida.");
                    break;
                case 3:
                    System.out.println("Has seleccionat Configuració.");
                    break;
                case 4:
                    System.out.println("Has seleccionat Sortir. Fins aviat!");
                    break;
                default:
                    System.out.println("Opció invàlida. Torna a intentar.");
                    break;
                }
            }
        }
    public void mostrarTaulell() {}

    public void recollirJugada() {}

    public void fiDePartida() {}
    }


