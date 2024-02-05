public class App {
    public static void main(String[] args) throws Exception {
        Loki loki = Loki.getInstance();
        loki.loki("viesti 1\n");
        loki.loki("viesti 2\n");

        loki.loki("error 1\n");

        loki.sulje();
    }
}
