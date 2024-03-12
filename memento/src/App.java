public class App {
    public static void main(String[] args) throws Exception {
        final int ARVAILIJOIDEN_MAARA = 5; 
        Arvuuttaja arvuuttaja = new Arvuuttaja();

        for (int i = 1; i <= ARVAILIJOIDEN_MAARA; i++) {
            Arvailija arvailija = new Arvailija(arvuuttaja, i);
            new Thread(arvailija).start();
        }
    }
}
