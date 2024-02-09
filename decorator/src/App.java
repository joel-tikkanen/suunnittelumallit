public class App {
    public static void main(String[] args) throws Exception {
        Pizza margarita = new TomaattikastikeDecorator(new JuustoDecorator(new PizzaPohja()));
        Pizza hawaii = new AnanasDecorator(new KinkkuDecorator(new JuustoDecorator(new TomaattikastikeDecorator(new PizzaPohja()))));
        Pizza lihaisa = new KinkkuDecorator(new SalamiDecorator(new JuustoDecorator(new TomaattikastikeDecorator(new PizzaPohja()))));

        System.out.println("Pizza Menu:");
        System.out.println("Margarita: " + margarita.getTaytteet() + " Hinta: " + margarita.getHinta() + "€");
        System.out.println("Hawaii: " + hawaii.getTaytteet() + " Hinta: " + hawaii.getHinta() + "€");
        System.out.println("Lihaisa: " + lihaisa.getTaytteet() + " Hinta: " + lihaisa.getHinta() + "€");
    }
}
