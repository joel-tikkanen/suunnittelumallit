public class Arvailija implements Runnable {
    private Object memento;
    private Arvuuttaja arvuuttaja;
    private int arvailijaId;

    public Arvailija(Arvuuttaja arvuuttaja, int id) {
        this.arvuuttaja = arvuuttaja;
        this.arvailijaId = id;
        this.memento = arvuuttaja.liityPeliin(); 
    }

    @Override
    public void run() {
        int arvaus = 0;
        while (true) {
            arvaus = (int) (Math.random() * 10) + 1; 
            System.out.println("Arvailija " + arvailijaId + " arvaa: " + arvaus);
            if (arvuuttaja.arvaaLuku(memento, arvaus)) {
                System.out.println("Arvailija " + arvailijaId + " arvasi oikein: " + arvaus);
                break;
            }
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Arvailijan säie keskeytettiin");
            }
        }
    }
}
