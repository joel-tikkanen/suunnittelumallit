import java.util.Random;

public class Arvuuttaja {
    
    private class Memento {
        private final int arvattavaLuku;

        private Memento(int luku) {
            this.arvattavaLuku = luku;
        }

        private boolean tarkistaLuku(int arvaus) {
            return this.arvattavaLuku == arvaus;
        }
    }

    public Object liityPeliin() {
        Random random = new Random();
        int arvottuLuku = random.nextInt(10) + 1; 
        return new Memento(arvottuLuku);
    }

    public boolean arvaaLuku(Object mementoObj, int arvaus) {
        if (mementoObj instanceof Memento) {
            Memento memento = (Memento) mementoObj;
            return memento.tarkistaLuku(arvaus);
        }
        return false;
    }
}
