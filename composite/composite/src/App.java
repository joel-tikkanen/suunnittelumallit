public class App {
    public static void main(String[] args) throws Exception {
       TietokoneTehdas tehdas = new PelitietokoneTehdas();
       Laiteosa kotelo = tehdas.luoKotelo();

       System.out.println(kotelo.getHinta());

    }
}
