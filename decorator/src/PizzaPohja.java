public class PizzaPohja implements Pizza {

    @Override
    public String getTaytteet() {
        return "Pohja";
    }

    @Override
    public double getHinta() {
        return 1; 
    }
}