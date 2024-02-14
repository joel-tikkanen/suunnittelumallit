public class Charmeleon extends PokemonState {

    private static Charmeleon instance;

    private Charmeleon() {}

    public static Charmeleon getInstance() {
        if (instance == null) {
            instance = new Charmeleon();
        }
        return instance;
    }

    @Override
    public void isku1(Pokemon pokemon){
        System.out.println(pokemon.toString() + " isku1");
    }

    @Override
    public void isku2(Pokemon pokemon){
        System.out.println(pokemon.toString() + " isku2");
    }

    @Override
    public void isku3(Pokemon pokemon){
        System.out.println(pokemon.toString() + " isku3");
        PokemonState s = Charizard.getInstance();
        System.out.println(pokemon.toString() + " kehittyy muotoon " + s.toString());
        kehitys(pokemon, Charizard.getInstance());
    }

    @Override
    public String toString() {
        return "Charmeleon";
    }
}
