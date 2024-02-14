public class Charmander extends PokemonState {

    private static Charmander instance;

    private Charmander() {}

    public static Charmander getInstance() {
        if (instance == null) {
            instance = new Charmander();
        }
        return instance;
    }

    public void isku1(Pokemon pokemon){
        System.out.println(pokemon.toString() + " isku1");
    }

    public void isku2(Pokemon pokemon){
        System.out.println(pokemon.toString() + " isku2");
    }

    public void isku3(Pokemon pokemon){
        System.out.println(pokemon.toString() + " isku3");
       
        PokemonState s = Charmeleon.getInstance();
        System.out.println(pokemon.toString() + " kehittyy muotoon " + s.toString());
        kehitys(pokemon, Charmeleon.getInstance());
    }


    @Override
    public String toString() {
        return "Charmander";
    }

}
