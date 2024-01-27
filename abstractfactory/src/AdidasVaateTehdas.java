public class AdidasVaateTehdas implements Vaatetehdas {

    @Override
    public Vaate luoLippis() {
        return new Lippis(Merkki.ADIDAS);
    }

    @Override
    public Vaate luoKengat() {
        return new Kengat(Merkki.ADIDAS);
    }

    @Override
    public Vaate luoPaita() {
        return new Paita(Merkki.ADIDAS);
    }

    @Override
    public Vaate luoFarmarit() {
        return new Farmarit(Merkki.ADIDAS);
    }
    
}
