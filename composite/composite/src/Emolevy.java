import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {

    public List<Laiteosa> kiinnitetyt = new ArrayList<Laiteosa>();

    private double hinta;

    public Emolevy(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public void lisaaLaite(Laiteosa lisattava) {
        kiinnitetyt.add(lisattava);
    }

    @Override
    public double getHinta() {
        return hinta + kiinnitetyt.stream().mapToDouble(Laiteosa::getHinta).sum();
    }

 
    
}
