public class BossVaateTehdas implements Vaatetehdas {

    @Override
    public Vaate luoLippis() {
        return new Lippis(Merkki.BOSS);
    }

    @Override
    public Vaate luoKengat() {
        return new Kengat(Merkki.BOSS);
    }

    @Override
    public Vaate luoPaita() {
        return new Paita(Merkki.BOSS);
    }

    @Override
    public Vaate luoFarmarit() {
        return new Farmarit(Merkki.BOSS);
    }
    
}
