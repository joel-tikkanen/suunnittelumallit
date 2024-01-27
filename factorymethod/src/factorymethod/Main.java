package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus opettaja1 = new Opettaja1();
        AterioivaOtus opettaja2 = new Opettaja2();

        opettaja.aterioi();
        opettaja1.aterioi();
        opettaja2.aterioi();
        
    }
}
