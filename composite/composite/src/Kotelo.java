import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa {

    private double hinta;

    public List<Laiteosa> kiinnitetyt = new ArrayList<Laiteosa>();


    public Kotelo(double hinta) {
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
