public class Charizard extends PokemonState  {

    private static Charizard instance;

    private Charizard() {}

    public static Charizard getInstance() {
        if (instance == null) {
            instance = new Charizard();
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
    }

    @Override
    public String toString() {
        return "Charizard";
    }

    
}
