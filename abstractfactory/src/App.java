public class App {
    public static void main(String[] args) throws Exception {
       
        Jasper opiskelijaJasper = new Jasper();
        Jasper insinooriJasper = new Jasper();

        Vaatetehdas adidasTehdas = new BossVaateTehdas();
        Vaatetehdas bossTehdas = new BossVaateTehdas();


        System.out.println("Opiskelijana: ");
        opiskelijaJasper.pueVaatteet(adidasTehdas);
        opiskelijaJasper.luetteleVaatteetYlpeana();

        System.out.println("Insinöörinä: ");

        insinooriJasper.pueVaatteet(bossTehdas);
        opiskelijaJasper.luetteleVaatteetYlpeana();

        
    }
}
