package factorymethod;


public class Opettaja2 extends AterioivaOtus {
    public Juoma createJuoma(){
        return new Fanta();
    };
}
