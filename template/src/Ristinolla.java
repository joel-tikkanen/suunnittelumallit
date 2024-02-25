import java.util.Scanner;

public class Ristinolla extends Game {

    Merkki[] lauta;

    int vuoro = 0;

    private final int laudanKoko = 3;

    private Scanner scanner;

    private Merkki voittaja = null; 

    @Override
    void initializeGame() {
        lauta = new Merkki[laudanKoko * laudanKoko];
        for (int i = 0; i < lauta.length; i++) {
            lauta[i] = Merkki.TYHJÄ;
        }
        scanner = new Scanner(System.in);
    }

    void tulostaLauta() {
        for (int i = 0; i < laudanKoko; i++) {
            for (int j = 0; j < laudanKoko; j++) {
                int indeksi = i * laudanKoko + j;
                System.out.print(" " + lauta[indeksi] + " ");
            }
            System.out.println("\n");
        }
    }

    @Override
    void makePlay(int player) {
        tulostaLauta();
        Merkki merkki = (player % 2 == 0) ? Merkki.RISTI : Merkki.NOLLA;
        System.out.println(String.format("Pelaaja: %s, Syötä siirtosi indeksi ", merkki));
        int index = Integer.parseInt(scanner.nextLine());

        if (index >= 0 && index < laudanKoko * laudanKoko && lauta[index] == Merkki.TYHJÄ) {
            lauta[index] = merkki;
        } else {
            System.out.println("Virheellinen siirto, yritä uudelleen.");
            makePlay(player); 
        }

    }

    @Override
    boolean endOfGame() {

        for (int i = 0; i < 3; i++) {
            if (tarkistaVoitto(i * 3, (i * 3) + 1, (i * 3) + 2)) {
                voittaja = lauta[i * 3];
                return true;
            }
            if (tarkistaVoitto(i, i + 3, i + 6)) {
                voittaja = lauta[i];
                return true;
            }
        }
        if (tarkistaVoitto(0, 4, 8)) {
            voittaja = lauta[0];
            return true;
        }
        if (tarkistaVoitto(2, 4, 6)) {
            voittaja = lauta[2];
            return true;
        }

        
        for (int i = 0; i < lauta.length; i++) {
            if (lauta[i] == Merkki.TYHJÄ) return false;
        }

        return true; 
    }

    @Override
    void printWinner() {
        if (voittaja != null) {
            System.out.println("Voittaja: " + voittaja);
        } else {
            System.out.println("Tasapeli.");
        }
    }

    private boolean tarkistaVoitto(int a, int b, int c) {
        return lauta[a] != Merkki.TYHJÄ && lauta[a] == lauta[b] && lauta[b] == lauta[c];
    }

}
