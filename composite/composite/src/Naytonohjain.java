public class Naytonohjain implements Laiteosa {


    private double hinta;


    public Naytonohjain(double hinta) {
        this.hinta = hinta;
    }


    @Override
    public void lisaaLaite(Laiteosa lisattava) {
        throw new UnsupportedOperationException("Et voi lisätä laitetta muuhun kuin emolevyyn tai koteloon");
    }



    @Override
    public double getHinta() {
        return hinta;
    }
    
}
