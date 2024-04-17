public class Kello implements Cloneable {
    private Viisari tunnit;
    private Viisari minuutit;

    public Kello(int tunnit, int minuutit) {
        this.tunnit = new Viisari(tunnit);
        this.minuutit = new Viisari(minuutit);
    }

    public void setAika(int tunnit, int minuutit) {
        this.tunnit.setArvo(tunnit);
        this.minuutit.setArvo(minuutit);
    }

    public void naytaAika() {
        System.out.println(String.format("%02d:%02d", tunnit.getArvo(), minuutit.getArvo()));
    }

    // Syväkopiointi
    @Override
    public Kello clone() {
        try {
            Kello kopio = (Kello) super.clone();
            kopio.tunnit = this.tunnit.clone();
            kopio.minuutit = this.minuutit.clone();
            return kopio;
        } catch (Exception e) {
            throw new AssertionError();
        }
    }

    public Kello matalaKopiointiKello() {
        try {
            return (Kello) super.clone();
        } catch (Exception e) {
            throw new AssertionError();
        }
    }
}
