public class App {
    public static void main(String[] args) {
        Hahmo soturi = new Soturi();
        Hahmo velho = new Velho();
        
        soturi.asetaTila(Hyokkays.getInstance());
        velho.asetaTila(Puolustus.getInstance());
        
        ConcreateBonusVisitor visitor = new ConcreateBonusVisitor();
        
        soturi.accept(visitor);
        velho.accept(visitor);
        
        System.out.println("Soturin bonuspisteet: " + soturi.bonusPisteet);
        System.out.println("Velhon bonuspisteet: " + velho.bonusPisteet);
    }
}
