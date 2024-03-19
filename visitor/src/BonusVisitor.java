interface BonusVisitor {
    void visit(Hyokkays hyokkays, Hahmo hahmo);
    void visit(Puolustus puolustus, Hahmo hahmo);
}

class ConcreateBonusVisitor implements BonusVisitor {
    @Override
    public void visit(Hyokkays hyokkays, Hahmo hahmo) {
        if (hahmo instanceof Soturi) {
            hahmo.lisaaBonusPisteet(5);
        } else if (hahmo instanceof Velho) {
            hahmo.lisaaBonusPisteet(3);
        }
    }

    @Override
    public void visit(Puolustus puolustus, Hahmo hahmo) {

        if (hahmo instanceof Soturi) {
            hahmo.lisaaBonusPisteet(2);
        } else if (hahmo instanceof Velho) {
            hahmo.lisaaBonusPisteet(4);
        }
    }
}