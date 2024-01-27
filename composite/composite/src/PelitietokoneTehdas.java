public class PelitietokoneTehdas implements TietokoneTehdas {

    @Override
    public Laiteosa luoKotelo() {
        Kotelo kotelo = new Kotelo(100.0);
        kotelo.lisaaLaite(luoEmolevy());
        return kotelo;

    }

    @Override
    public Laiteosa luoEmolevy() {
        Emolevy emolevy = new Emolevy(100.0);
        emolevy.lisaaLaite(luoProsessori());
        emolevy.lisaaLaite(luoNaytonohjain());
        emolevy.lisaaLaite(luoVerkkokortti());
        emolevy.lisaaLaite(luoMuistipiiri());
        return emolevy;
    }

    @Override
    public Laiteosa luoProsessori() {
        return new Prosessori(200.0);
    }

    @Override
    public Laiteosa luoNaytonohjain() {
        return new Naytonohjain(500.0);
    }

    @Override
    public Laiteosa luoVerkkokortti() {
       return new Verkkokortti(100.0);
    }

    @Override
    public Laiteosa luoMuistipiiri() {
        return new Muistipiiri(100.0); 
    }
    
}
