interface HahmoState {
    void accept(BonusVisitor visitor, Hahmo hahmo);
}

class Hyokkays implements HahmoState {
    private static Hyokkays instance = new Hyokkays();

    private Hyokkays() {} 

    public static Hyokkays getInstance() {
        return instance;
    }

    @Override
    public void accept(BonusVisitor visitor, Hahmo hahmo) {
        visitor.visit(this, hahmo);
    }
}

class Puolustus implements HahmoState {
    private static Puolustus instance = new Puolustus();

    private Puolustus() {} 

    public static Puolustus getInstance() {
        return instance;
    }

    @Override
    public void accept(BonusVisitor visitor, Hahmo hahmo) {
        visitor.visit(this, hahmo);
    }
}
abstract class Hahmo {
    protected HahmoState tila;
    protected int bonusPisteet = 0;

    public void asetaTila(HahmoState tila) {
        this.tila = tila;
    }

    public void accept(BonusVisitor visitor) {
        tila.accept(visitor, this);
    }

    public void lisaaBonusPisteet(int pisteet) {
        bonusPisteet += pisteet;
    }
}

class Soturi extends Hahmo {
    
}

class Velho extends Hahmo {
   
}
