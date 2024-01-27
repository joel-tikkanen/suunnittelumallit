package factorymethod;


public class Opettaja1 extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Maito();
    };

}
