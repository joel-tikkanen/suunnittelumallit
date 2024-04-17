public class App {
    public static void main(String[] args) throws Exception {
        Kello kello = new Kello(12, 30);
        Kello kelloSyväKlooni = kello.clone();
        Kello matalakopioKello = kello.matalaKopiointiKello();

       
        System.out.println("Alkuperäinen kello:");
        kello.naytaAika();
        System.out.println("Kloonattu kello:");
        kelloSyväKlooni.naytaAika();

        System.out.println("Matalakopioitu kello:");
        matalakopioKello.naytaAika();

        kello.setAika(10, 45);

        System.out.println("Alkuperäisen kellon aika ajan muutoksen jälkeen:");
        kello.naytaAika();
        System.out.println("Kloonatun kellon aika ajan muutoksen jälkeen:");
        kelloSyväKlooni.naytaAika();
        System.out.println("Matalakopioidun kellon aika ajan muutoksen jälkeen:");
        matalakopioKello.naytaAika();
    }
}
